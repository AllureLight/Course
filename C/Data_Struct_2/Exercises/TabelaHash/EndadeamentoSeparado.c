#include <stdio.h>
#include <stdlib.h>

//Coloca tudo num vetor, um numero seguido do outro
//se nn ouver espaço coloca no proximo

#define TABLE_SIZE 10

typedef struct Node {
    int key;
    struct Node *next;
} Node;

Node *table[TABLE_SIZE];

int hash(int key) {
    return key % TABLE_SIZE;
}

void initTable() {
    for (int i = 0; i < TABLE_SIZE; i++)
        table[i] = NULL;
}

void insert(int key) {
    int index = hash(key);

    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->key = key;
    newNode->next = table[index];
    table[index] = newNode;
}

int search(int key) {
    int index = hash(key);
    Node *current = table[index];

    while (current != NULL) {
        if (current->key == key)
            return 1;
        current = current->next;
    }
    return 0;
}

void printTable() {
    for (int i = 0; i < TABLE_SIZE; i++) {
        printf("%d: ", i);
        Node *current = table[i];
        while (current != NULL) {
            printf("%d -> ", current->key);
            current = current->next;
        }
        printf("NULL\n");
    }
}

int main() {
    initTable();

    insert(10);
    insert(20);
    insert(30);
    insert(21);

    printTable();

    printf("\nBuscar 20: %s\n", search(20) ? "Encontrado" : "Nao encontrado");
    printf("Buscar 99: %s\n", search(99) ? "Encontrado" : "Nao encontrado");

    return 0;
}