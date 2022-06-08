using System;

namespace Exercise4
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.Write("Enter first altitude: ");
            int altitude1 = int.Parse(Console.ReadLine());

            Console.Write("Enter Second Altitude: ");
            int altitude2 = int.Parse(Console.ReadLine());

            Console.WriteLine(altitude1 - altitude2);
        }
    }
}
