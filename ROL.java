import java.util.Scanner;
public class ROL
{
    public static void main(String[] args)
    {
        String cerrar="",Nombre = "";
        int Busqueda=0,Ruleta_SN=0,Tipo_Apuesta,Numero_Color,Id_Ruleta = 0,Indice_1 = 0,Indice_2 = 0,Indice_3 = 0,Valor_Apuesta = 0,Numero_Ganador,Color_Ganador,Ganancia;
        Scanner in = new Scanner(System.in);
        String Ruletas [][] = new String[100][100];
        for(int fn=0; fn<=2;fn++)
        {
            System.out.println("Hola Bienvenido a Ruletas online");
            System.out.println("¿como es tu nombre?");
            Nombre = in.nextLine();
            Ruletas[Indice_1][Indice_2] = (Nombre);
            System.out.printf("%s ¿cuentas con una ruleta? \n selecciona 1 para si \n selecciona 2 para no\n", Nombre);
            Ruleta_SN=in.nextInt();
            if(Ruleta_SN==2||Ruleta_SN==1)
            {
                if(Ruleta_SN==1)
                {
                    System.out.printf("%s Ingresa el ID de tu ruleta.\n ", Nombre);
                    Busqueda=in.nextInt();
                    Ruletas[5][Indice_2]=String.valueOf(Busqueda);
                    Indice_1=0;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    Indice_1++;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    Indice_1++;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    Indice_1++;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    Indice_1++;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    Indice_1++;
                    System.out.println(Ruletas[Indice_1][Busqueda]);
                    for(int a=0;a<=2;a++)
                    {
                        Indice_2=Busqueda+1;
                        for(int i=0;i<=2;i++)
                        {
                            System.out.println("ingresa el valor que deseas apostar");
                            Valor_Apuesta=in.nextInt();
                            if(Valor_Apuesta<=10000)
                            {
                                ++Indice_1;
                                Ruletas[Indice_1][Indice_2] = String.valueOf(Valor_Apuesta);
                                i=2;
                            }else{
                                System.out.printf("%s El monto maximo a aportar son 10000 dolares, preciona enter para continuar", Nombre);
                                i=1;
                            }
                        }
                        for(int ii=0;ii<=2;ii++)
                        {
                            Numero_Ganador = (int)Math.floor(Math.random() * 36.0D + 0.0D);
                            Color_Ganador = (int)Math.floor(Math.random() * 2.0D + 1.0D);
                            System.out.println("¿Que tipo de apuesta deseas hacer?  \n selecciona 1 para apuesta numerica \n selecciona 2 para apuestas con color \n");
                            Tipo_Apuesta = in.nextInt();
                            Indice_1++;
                            Ruletas[Indice_1][Indice_2] = String.valueOf(Tipo_Apuesta);
                            if(Tipo_Apuesta==1)
                            {
                                System.out.printf("%s ingresa el numero que elijes para la apuesta \n", Nombre);
                                Numero_Color = in.nextInt();
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2] = String.valueOf(Numero_Color);
                                if(Numero_Color==Numero_Ganador)
                                {
                                    Ganancia = Valor_Apuesta*5;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }else if(Numero_Color!=Numero_Ganador){
                                    Ganancia=0;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }
                            }else if(Tipo_Apuesta==2)
                            {
                                System.out.printf("%s ingresa el color que elijes para la apuesta \n selecciona 1 para negro \n selecciona 2 para rojo \n", Nombre);
                                Numero_Color = in.nextInt();
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2] = String.valueOf(Numero_Color);
                                if(Numero_Color==Color_Ganador)
                                {
                                    Ganancia=Valor_Apuesta/100*180;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }else if(Numero_Color!=Color_Ganador){
                                    Ganancia=0;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }
                            }else{
                                System.out.printf("%s es incorrecto el tipo de apuesta que elejiste", Nombre);
                            }
                              System.out.printf("%s ¿Quieres cerrar la ruleta? \n selecciona 1 para No cerrar la ruleta\n selecciona 2 para cerrar la rulerta \n", Nombre);
                            ii=in.nextInt();
                            cerrar=String.valueOf(ii);
                            if(ii==1)
                            {
                                cerrar=("Ruleta Abierta");
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2]=(cerrar);
                            }else if(ii==2)
                            {
                                cerrar=("Ruleta Cerrada");
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2]=(cerrar);
                            }
                            System.out.printf("%s Verifica la tus datos.\n", Nombre);
                            System.out.println(Ruletas[0][Indice_2]);
                            System.out.println(Ruletas[1][Indice_2]);
                            System.out.println(Ruletas[2][Indice_2]);
                            System.out.println(Ruletas[3][Indice_2]);
                            System.out.println(Ruletas[4][Indice_2]);
                            System.out.println(Ruletas[5][Indice_2]);
                        }
                    }
                }

                if(Ruleta_SN==2)
                {
                    Indice_1=1;
                    Ruletas[5][Indice_2]=String.valueOf(Id_Ruleta);
                    for(int i=0;i<=2;i++)
                    {
                        System.out.println("ingresa el valor que deseas apostar");
                        Valor_Apuesta=in.nextInt();
                        if(Valor_Apuesta<=10000)
                        {
                            ++Indice_1;
                            Ruletas[Indice_1][Indice_2] = String.valueOf(Valor_Apuesta);
                            i=2;
                        }else{
                            System.out.printf("%s El monto maximo a aportar son 10000 dolares, preciona enter para continuar", Nombre);
                            i=1;
                        }
                        for(int ii=0;ii<=2;ii++)
                        {
                            Numero_Ganador = (int)Math.floor(Math.random() * 36.0D + 0.0D);
                            Color_Ganador = (int)Math.floor(Math.random() * 2.0D + 1.0D);
                            System.out.println("¿Que tipo de apuesta deseas hacer?  \n selecciona 1 para apuesta numerica \n selecciona 2 para apuestas con color \n");
                            Tipo_Apuesta = in.nextInt();
                            Indice_1++;
                            Ruletas[Indice_1][Indice_2] = String.valueOf(Tipo_Apuesta);
                            if(Tipo_Apuesta==1)
                            {
                                System.out.printf("%s ingresa el numero que elijes para la apuesta \n", Nombre);
                                Numero_Color = in.nextInt();
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2] = String.valueOf(Numero_Color);
                                if(Numero_Color==Numero_Ganador)
                                {
                                    Ganancia = Valor_Apuesta*5;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }else if(Numero_Color!=Numero_Ganador){
                                    Ganancia=0;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }
                            }else if(Tipo_Apuesta==2)
                            {
                                System.out.printf("%s ingresa el color que elijes para la apuesta \n selecciona 1 para negro \n selecciona 2 para rojo \n", Nombre);
                                Numero_Color = in.nextInt();
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2] = String.valueOf(Numero_Color);
                                if(Numero_Color==Color_Ganador)
                                {
                                    Ganancia=Valor_Apuesta/100*180;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }else if(Numero_Color!=Color_Ganador){
                                    Ganancia=0;
                                    Indice_1++;
                                    Ruletas[Indice_1][Indice_2] = String.valueOf(Ganancia);
                                }
                            }else{
                                System.out.printf("%s es incorrecto el tipo de apuesta que elejiste", Nombre);
                            }
                            System.out.printf("%s ¿Quieres cerrar la ruleta? \n selecciona 1 para No cerrar la ruleta\n selecciona 2 para cerrar la rulerta \n", Nombre);
                            ii=in.nextInt();
                            cerrar=String.valueOf(ii);
                            if(ii==1)
                            {
                                cerrar=("Ruleta Abierta");
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2]=(cerrar);
                            }else if(ii==2)
                            {
                                cerrar=("Ruleta Cerrada");
                                Indice_1++;
                                Ruletas[Indice_1][Indice_2]=(cerrar);
                            }
                            System.out.printf("%s Verifica la tus datos.\n", Nombre);
                            Indice_1=0;
                            System.out.println(Ruletas[0][Indice_2]);
                            System.out.println(Ruletas[1][Indice_2]);
                            System.out.println(Ruletas[2][Indice_2]);
                            System.out.println(Ruletas[3][Indice_2]);
                            System.out.println(Ruletas[4][Indice_2]);
                            System.out.println(Ruletas[5][Indice_2]);
                        }
                    }
                }
            }
        }
    }
}
