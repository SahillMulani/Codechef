import calendar

Month , Day, Year = input().split()
mydict = { "0" : "MONDAY",
         "1" : "TUESDAY",
         "2" : "WEDNESDAY",
         "3" : "THURSDAY",
         "4" : "FRIDAY",
         "5" : "SATURDAY",
         "6" : "SUNDAY"
}

result = calendar.weekday(int(Year),int(Month),int(Day))
print(mydict[str(result)])