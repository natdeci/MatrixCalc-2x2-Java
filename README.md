# MatrixCalc-2x2-Java
An addition, subtraction, multiplication, and division calculator for 2 by 2 matrices using Java. It focuses on the implementation of 2D arrays and using methods in Java. You can access the .java file in the src folder.

# Program Flow Overview

**1. First, the program will show the menu consisting of the operation options for the program:**

![image](https://user-images.githubusercontent.com/91313923/223731831-bc5b692a-21a0-4d13-b28e-912d03b0786a.png)

    Menu number 1 will execute method addition() that performs addition to the matrices.

    Menu number 2 will execute method subtraction() that performs subtraction to the matrices.

    Menu number 3 will execute method multiplication() that performs multiplication to the matrices.

    Menu number 4 will execute method division() that performs division to the matrices.

    Menu number 5 will make the while loop breaks and program will end.

**2. After that, user will be asked to input the number for the matrices. They will be asked to input the number per row like so:**

  ![image](https://user-images.githubusercontent.com/91313923/223732558-21e16f8c-7e17-41e5-99d6-b291cb34825a.png)

**3. After selecting the operation and inputting the matrix, program will show the result like so:**

  ![image](https://user-images.githubusercontent.com/91313923/223732764-219d2460-4045-4b25-a549-e3557ed57544.png)

**4. After the result is shown, it will ask the user if they want to continue. If the user chose 1, it will show the main menu again.**

  ![image](https://user-images.githubusercontent.com/91313923/223960355-141bd7f0-2d31-4294-9de7-fc73751ea121.png)

**5. If the user input 5 or chose 5 on the previous step, the program will show "BYE-BYE"**

  ![image](https://user-images.githubusercontent.com/91313923/223735161-fc2eb66b-996f-4972-acdd-afc7df9a583b.png)
  ![image](https://user-images.githubusercontent.com/91313923/223960595-08df1758-6cdd-40da-9c94-86ff12043f71.png)

# Details

**Method printmenu()**

  This function consists of printing syntaxes to make a console menu.

**Method matrixInput()**

  This function is for prompting the user to input the numbers for matrix1 and matrix2. The way the program prompts is not using a loop, instead it is coded manually per line considering the matrix is small.
  
**Method addition()**

  This function consists of a loop to perform addition to each numbers in the matrix in accordance with each of their position.

**Method subtraction()**

  This function consists of a loop to perform subtraction to each numbers in the matrix in accordance with each of their position.
  
**Method multiplication()**

  This function consists of a loop to perform multiplication to each numbers in the matrix in accordance with each of their position.
  
**Method division()**

  This function consists of a loop to perform multiplication to each numbers in the matrix in accordance with each of their position. First the determinant is calculated (for the right matrix) after that the positions of numbers in right matrix is modified and the matrix is multiplied by 1/determinant so it can become and inverse matrix. After that a multiplication between left matrix and inverse of right matrix is performed (by using loop just like multiplication()).
  
**Method askContinue()**

  This function prints a mini menu that asks the user if they want to continue and the user will have to input their choice.
  
# Test Cases

**1. Addition**

  ![image](https://user-images.githubusercontent.com/91313923/223752477-5a7c7989-1c4e-4f09-8eea-b768a08bbe49.png)

**2. Subtraction**

  ![image](https://user-images.githubusercontent.com/91313923/223752608-59308d80-2c12-4040-b724-6d3d02f126fb.png)

**3. Multiplication**

  ![image](https://user-images.githubusercontent.com/91313923/223752767-ebbc514e-0968-48a5-8137-7bde922c78e6.png)

**4. Division**

  ![image](https://user-images.githubusercontent.com/91313923/223752851-cf62b09d-752a-4cc7-8bff-fc32c177ca8d.png)
