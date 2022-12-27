# JavaConcurrencyDemo
In this techhub, we will observe the effects of concurrency on a simple java application
 
# What is Concurrency in Java ?
In Java, concurrency refers to the ability of multiple threads to execute concurrently within a single program. Threads are lightweight processes that can be used to execute multiple tasks concurrently within a single application.
Concurrency is useful for improving the performance and scalability of Java applications, as it allows multiple tasks to be executed simultaneously, potentially making better use of the available resources on a machine. 
It can also make applications more responsive by allowing them to perform background tasks while still maintaining a responsive user interface.

# Effects of Concurrency
To observe the effects of Concurrency, we have created a sample application for finding out the nth Prime Number.
We have created the followings classes to understand the effects of Concurrency on each class:

1) PrimeNumberNoConcurrency - We find the nth Prime Number inside the main thread without using concurrency.
2) PrimeNumberWithConcurrency - We start a new thread everytime we want to find the nth Prime Number.
3) PrimeNumberWithConcurrencyDaemon - We see the use of Daemon threads.
4) PrimeNumberWithConcurrencyThreadStates - We find out the state of each thread during its lifecycle.
