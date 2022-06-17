#biggest_number.py

inputnum = [-1,1,2,3,4,10]
basenum = 0

for x in inputnum:
    if basenum <= x:
        basenum = x
    else:
        basenum = basenum

print(basenum)