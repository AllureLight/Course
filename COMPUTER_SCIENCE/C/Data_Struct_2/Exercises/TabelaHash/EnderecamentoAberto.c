#include <stdio.h>
#include <stdlib.h>

//Separa as chaves contendo listas encadeadas
//rodar melhor para entender

#define TABLE_SIZE 10
#define EMPTY -1

int hash(int key) {
    return key % TABLE_SIZE;
}

void initTable(int table[]) {
    for (int i = 0; i < TABLE_SIZE; i++)
        table[i] = EMPTY;
}

void insert(int table[], int key) {
    int index = hash(key);

    while (table[index] != EMPTY) {
        index = (index + 1) % TABLE_SIZE;
    }

    table[index] = key;
}

int search(int table[], int key) {
    int index = hash(key);
    int start = index;

    while (table[index] != EMPTY) {
        if (table[index] == key)
            return 1;

        index = (index + 1) % TABLE_SIZE;

        if (index == start)
            break;
    }
    return 0;
}

void printTable(int table[]) {
    for (int i = 0; i < TABLE_SIZE; i++)
        printf("%d: %d\n", i, table[i]);
}

int main() {
    int table[TABLE_SIZE];

    initTable(table);

    insert(table, 10);
    insert(table, 20);
    insert(table, 40);
    insert(table, 21);

    printTable(table);

    printf("\nBuscar 20: %s\n", search(table, 20) ? "Encontrado" : "Nao encontrado");
    printf("Buscar 99: %s\n", search(table, 99) ? "Encontrado" : "Nao encontrado");

    return 0;
}