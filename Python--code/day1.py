name = input("Enter your name: ")
a = float(input("Enter first number: "))
b = float(input("Enter second number: "))

print(f"Hello, {name}!")
print("Sum:", a + b)
print("Difference:", a - b)
print("Product:", a * b)

if b != 0:
    print("Division:", a / b)
else:
    print("Cannot divide by zero")