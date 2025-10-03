# Function to check if a number is a palindrome  
def is_palindrome(num):  
    # Convert number to string  
    str_num = str(num)  
    # Check if string is equal to its reverse  
    return str_num == str_num[::-1]  
  
# Main program  
number = int(input("Enter a number: "))  
  
if is_palindrome(number):  
    print(f"{number} is a palindrome.")  
else:  
    print(f"{number} is not a palindrome.")  
