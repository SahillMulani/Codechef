import re

txt = "BANANA FRIES 12"
x = re.sub("\s", "-", txt, 1)
x = x.split()
print(x)