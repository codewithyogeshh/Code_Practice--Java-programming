#string[start : stop : step]

name = "PYTHON PROGRAMMING"

print(name[0:6])
print(name[7:18])
print(name[:6])
print(name[7:])
print(name[::2])
print(name[::-1])

#String Manipulate 

name = "hello python"

print(name.upper())
print(name.lower())
print(name.title())
print(name.capitalize())
print(name.swapcase())

#Remove Extra Space

text = "   Hello Python   "

print(text.strip())
print(text.lstrip())
print(text.rstrip())


#Replace Text

message = "I love Java"

new_message = message.replace("Java", "Python")

print(new_message)

#Find 