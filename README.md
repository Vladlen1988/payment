#Структура программы.  
Задача 1.  
Напишите программу для расчёта ежемесячного платежа по беспроцентной рассрочке.

Для этого создайте статический метод, который принимал бы три параметра:

первоначальный взнос start;
общую сумму покупки amount (в неё входит и первоначальный взнос);
количество лет, на которое дана рассрочка years.
Метод должен рассчитывать ежемесячный платёж и отдавать его в качестве возвращаемого значения; сам выводить на экран этот вспомогательный метод расчёта ничего не должен, выводом должен заниматься метод main.

Продемонстрируйте работу этого метода в main. Например, для суммы 2600000 со взносом 200000 и сроком 2 года ежемесячный платёж будет 100000 рублей.

Задача 2.  
Вынесите статический метод расчёта платежа рассрочки в отдельный класс Finances пакета ru.netology.finances. Помните, что сам Main в реплите всегда должен быть без пакета.
