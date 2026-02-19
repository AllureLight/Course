#include <stdio.h>
#include <stdlib.h>

#define MAX_RUNS 100

//Le parte do arquivo e o ordena, colocando na memoria segundaria
//faz isso repetindo ao longo do tempo e no final junto tudo

// Função de comparação para qsort
int compara(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

// Cria os blocos ordenados (runs)
int criaRuns(const char *entrada, int bloco) {
    FILE *in = fopen(entrada, "r");
    if (!in) {
        perror("Erro ao abrir arquivo de entrada");
        exit(1);
    }

    int *buffer = malloc(bloco * sizeof(int));
    int totalRuns = 0;

    while (1) {
        int i = 0;

        // Lê até o tamanho do bloco
        while (i < bloco && fscanf(in, "%d", &buffer[i]) == 1) {
            i++;
        }

        if (i == 0)
            break;

        // Ordena o bloco em memória
        qsort(buffer, i, sizeof(int), compara);

        // Cria arquivo temporário
        char nome[20];
        sprintf(nome, "run_%d.dat", totalRuns);
        FILE *out = fopen(nome, "w");

        for (int j = 0; j < i; j++)
            fprintf(out, "%d ", buffer[j]);

        fclose(out);
        totalRuns++;
    }

    free(buffer);
    fclose(in);

    return totalRuns;
}

// Faz o merge final dos runs
void mergeRuns(int totalRuns, const char *saida) {
    FILE *runs[MAX_RUNS];
    int valores[MAX_RUNS];
    int ativo[MAX_RUNS];

    for (int i = 0; i < totalRuns; i++) {
        char nome[20];
        sprintf(nome, "run_%d.dat", i);
        runs[i] = fopen(nome, "r");
        ativo[i] = fscanf(runs[i], "%d", &valores[i]) == 1;
    }

    FILE *out = fopen(saida, "w");

    while (1) {
        int menor = -1;

        for (int i = 0; i < totalRuns; i++) {
            if (ativo[i]) {
                if (menor == -1 || valores[i] < valores[menor])
                    menor = i;
            }
        }

        if (menor == -1)
            break;

        fprintf(out, "%d ", valores[menor]);
        ativo[menor] = fscanf(runs[menor], "%d", &valores[menor]) == 1;
    }

    for (int i = 0; i < totalRuns; i++)
        fclose(runs[i]);

    fclose(out);
}

int main() {
    int bloco;

    printf("Digite o tamanho do bloco de memoria: ");
    scanf("%d", &bloco);

    int totalRuns = criaRuns("entrada.txt", bloco);
    mergeRuns(totalRuns, "saida.txt");

    printf("Ordenacao externa concluida!\n");
    printf("Resultado salvo em 'saida.txt'\n");

    return 0;
}