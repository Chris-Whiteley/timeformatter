# TimeFormatter

## Overview
The `TimeFormatter` is a simple Java application that converts a given time (in hours and minutes) into a human-readable format using words. It can handle times in a 12-hour format and provide output like "quarter past nine" or "ten minutes to seven".

This project was developed using **Test-Driven Development (TDD)** principles. The test cases were written first, followed by the implementation of the logic to ensure that the code meets the expected outputs for a variety of inputs.

## Features
- Converts time in `hh:mm` format (12-hour clock) into a readable string.
- Handles common time formats:
  - Full hours: `six o'clock`, `twelve noon`
  - Minutes past the hour: `twenty four minutes past six`
  - Minutes to the next hour: `ten minutes to seven`
  - Special times like: `quarter past`, `half past`, `quarter to`, etc.
- Supports special cases like `noon` and `midnight`.

## Example Outputs
- Input: `6:00` → Output: `six o'clock`
- Input: `12:00` → Output: `twelve noon`
- Input: `6:24` → Output: `twenty four minutes past six`
- Input: `6:50` → Output: `ten minutes to seven`
- Input: `12:45` → Output: `quarter to one`
- Input: `23:59` → Output: `one minute to midnight`

## How to Use
The main method prompts the user to input hours and minutes in a loop. The program will then print the time in words. The loop terminates when the user enters a negative hour value.

### Running the Code
You can run the main class in an IDE or from the command line. The program will keep prompting for time input until you provide a negative hour value, at which point it will exit.

### Example Run
```plaintext
Enter hours (negative to exit): 10
Enter minutes: 30
half past ten

Enter hours (negative to exit): 12
Enter minutes: 15
quarter past noon

Enter hours (negative to exit): -1
Exiting...
