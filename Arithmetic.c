#include <stdio.h>

// Function declarations
int add(int x, int y);
int subtract(int x, int y);
int multiply(int x, int y);
float divide(int x, int y);

int main() {
    int a, b, choice;
    
    printf("Enter two numbers: ");
    scanf("%d%d", &a, &b);
    
    printf("\nChoose an operation:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division\n");
    printf("Enter your choice (1-4): ");
    scanf("%d", &choice);
    
    switch(choice) {
        case 1:
            printf("Result = %d\n", add(a, b));
            break;
        case 2:
            printf("Result = %d\n", subtract(a, b));
            break;
        case 3:
            printf("Result = %d\n", multiply(a, b));
            break;
        case 4:
            if (b != 0)
                printf("Result = %.2f\n", divide(a, b));
            else
                printf("Error! Division by zero not allowed.\n");
            break;
        default:
            printf("Invalid choice!\n");
    }
    
    return 0;
}

// Function definitions
int add(int x, int y) {
    return x + y;
}

int subtract(int x, int y) {
    return x - y;
}

int multiply(int x, int y) {
    return x * y;
}

float divide(int x, int y) {
    return (float)x / y;
}
