##string_reverse.py

inputstring = "Hello world"

# Reverseing the string using a for loop
stringlength = len(inputstring) - 1

for x in range(stringlength):
    print (inputstring[stringlength])
    stringlength -= 1
print (inputstring[0])