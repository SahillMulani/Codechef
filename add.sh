#!/bin/sh
count=0
read divisor
for n in 10 12 15 20
do
#Check whether they are equal
    if (( ($a % $divisor) == 0 ))
    then
        count = count + 1 
    fi
done
  
