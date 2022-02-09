# Java Recursive Exersizes

This repository is a collection of recursive programs that I wrote in Java during my undergraduate studies.

## Log_of()

### Description:

This class will take the log of two numbers and compare it to a number, until the logs are within 0.001 accuracy

### Example Inputs/Outputs:

**Note: Example inputs and outputs are displayed to mimic the program on a command line**

#### Example 1.

    Enter a number from 1.0 - 1000:
    34.21
    k = 31.622776601683793	 	 log(k) = 1.5
    k = 177.82794100389228	 	 log(k) = 2.25
    k = 74.98942093324558	 	 log(k) = 1.875
    k = 48.69675251658631	 	 log(k) = 1.6875
    k = 39.241897584845354	 	 log(k) = 1.59375
    k = 35.22694651473101	 	 log(k) = 1.546875
    k = 33.37624694292038	 	 log(k) = 1.5234375
    k = 34.28911293575135	 	 log(k) = 1.53515625
    k = 33.82960095533677	 	 log(k) = 1.529296875
    k = 34.058581998212205	 	 log(k) = 1.5322265625
    k = 34.173653076138145	 	 log(k) = 1.53369140625
    k = 34.231334326241026	 	 log(k) = 1.534423828125
    k = 34.20248154152356	 	 log(k) = 1.5340576171875
    k = 34.21690489268398	 	 log(k) = 1.53424072265625
    k = 34.209692456964454	 	 log(k) = 1.534149169921875
    Log of 34.21 is approximately 1.534149169921875

#### Example 2.

    Enter a number from 1.0 - 1000:
    340
    k = 31.622776601683793	 	 log(k) = 1.5
    k = 177.82794100389228	 	 log(k) = 2.25
    k = 421.6965034285823	 	 log(k) = 2.625
    k = 273.8419634264361	 	 log(k) = 2.4375
    k = 339.82083289425594	 	 log(k) = 2.53125
    k = 378.551524925863	 	 log(k) = 2.578125
    k = 358.6637624484769	 	 log(k) = 2.5546875
    k = 349.11519371724427	 	 log(k) = 2.54296875
    k = 344.43666457715193	 	 log(k) = 2.537109375
    k = 342.12096433268636	 	 log(k) = 2.5341796875
    k = 340.96895907123206	 	 log(k) = 2.53271484375
    k = 340.39441191458116	 	 log(k) = 2.531982421875
    k = 340.1075014894017	 	 log(k) = 2.5316162109375
    k = 339.96413697581823	 	 log(k) = 2.53143310546875
    k = 340.0358116770148	 	 log(k) = 2.531524658203125
    k = 339.9999724377168	 	 log(k) = 2.5314788818359375
    Log of 340.0 is approximately 2.5314788818359375

#### Example 3.

    Enter a number from 1.0 - 1000:
    0
    Invalid number

#### Example 4.

    Enter a number from 1.0 - 1000:
    1001
    Invalid number

## Logs()

### Description:

This class will take a range, starting number and interval from the user, and display the log value of numbers in the range over the interval.

### Example Inputs/Outputs:

**Note: Example inputs and outputs are displayed to mimic the program on a command line**

#### Example 1.

    Enter desired range: 100  
    Enter desired starting point: 1
    Enter desired interval of logs: 5
    Log10(1.0)  =  0.0
    Log10(6.0)  =  0.7781512503836436
    Log10(11.0)  =  1.0413926851582251
    Log10(16.0)  =  1.2041199826559248
    Log10(21.0)  =  1.3222192947339193
    Log10(26.0)  =  1.414973347970818
    Log10(31.0)  =  1.4913616938342726
    Log10(36.0)  =  1.5563025007672873
    Log10(41.0)  =  1.6127838567197355
    Log10(46.0)  =  1.662757831681574
    Log10(51.0)  =  1.7075701760979363
    Log10(56.0)  =  1.7481880270062005
    Log10(61.0)  =  1.7853298350107671
    Log10(66.0)  =  1.8195439355418688
    Log10(71.0)  =  1.8512583487190752
    Log10(76.0)  =  1.8808135922807914
    Log10(81.0)  =  1.9084850188786497
    Log10(86.0)  =  1.9344984512435677
    Log10(91.0)  =  1.9590413923210936
    Log10(96.0)  =  1.9822712330395684
    Log10(101.0)  =  2.0043213737826426

#### Example 2.

    Enter desired range: 10
    Enter desired starting point: 0
    Enter desired interval of logs: 1
    Log10(0.0)  =  -Infinity
    Log10(1.0)  =  0.0
    Log10(2.0)  =  0.3010299956639812
    Log10(3.0)  =  0.47712125471966244
    Log10(4.0)  =  0.6020599913279624
    Log10(5.0)  =  0.6989700043360189
    Log10(6.0)  =  0.7781512503836436
    Log10(7.0)  =  0.8450980400142568
    Log10(8.0)  =  0.9030899869919435
    Log10(9.0)  =  0.9542425094393249

#### Example 3.

    Enter desired range: 1
    Enter desired starting point: 1000
    Enter desired interval of logs: .1
    Log10(1000.0)  =  3.0
    Log10(1000.1)  =  3.0000434272768626
    Log10(1000.2)  =  3.000086850211649
    Log10(1000.3)  =  3.000130268805227
    Log10(1000.4)  =  3.000173683058465
    Log10(1000.5)  =  3.00021709297223
    Log10(1000.6)  =  3.0002604985473904
    Log10(1000.7)  =  3.0003038997848126
    Log10(1000.8)  =  3.0003472966853635
    Log10(1000.9)  =  3.0003906892499104


## Palindrome()

### Description:

This program will check if a string is a palindrome using recursion.

### Example Inputs/Outputs:

**Note: Example inputs and outputs are displayed to mimic the program on a command line**

#### Example 1.

    Enter string to check if it is a palindrome:  
    T. Eliot, top bard, notes putrid tang emanating, is sad. I’d assign it a name: gnat dirt upset on drab pot-toilet.  
    T. Eliot, top bard, notes putrid tang emanating, is sad. I’d assign it a name: gnat dirt upset on drab pot-toilet. is a palindrome  

#### Example 2.

    Enter string to check if it is a palindrome:  
    This is not a palindrome  
    This is not a palindrome is not a palindrome  


#### Example 3.

    Enter string to check if it is a palindrome:  
    Yo! Banana Boy.  
    Yo! Banana Boy. is a palindrome  

## RecursiveCircles()  

### Description:

This class will create circles objects when you click. the circles will be drawn recursively.

### Example Inputs/Outputs:

#### Example 1.

![image](https://user-images.githubusercontent.com/32054606/153106319-b403f424-7af9-4deb-8fee-e2a32b829a2b.png)


## SumOfSeries()

### Description:

This program will add the sum of the series 1/k using recursion.

### Example Inputs/Outputs

**Note: Example inputs and outputs are displayed to mimic the program on a command line**

#### Example 1.
    Enter the Number of summations desired:  
    6  
    Sum is 1.3833333333333335  

#### Example 2. 
    Enter the Number of summations desired:  
    1  
    Sum is 1.0  

#### Example 3. 
    Enter the Number of summations desired:  
    17  
    Sum is 1.2783046202163852  

#### Example 4. 
    Enter the Number of summations desired:  
    0  
    Sum is 0.0  
