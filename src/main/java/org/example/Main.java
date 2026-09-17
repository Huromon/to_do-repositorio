package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tareas;
        String[] datos = new String[3];
int act= 0;
        List base = new ArrayList();
        Scanner sc = new Scanner(System.in);
boolean fin=false;
while(!fin){
            act=0;
            System.out.println("0 para ingresar tarea - 1 para ver tareas pendientes - 2 modificar estado tarea -3 eliminar tarea y 4 ver todo ");
            act=sc.nextInt();
            if(act==0) {
                System.out.println("");
                tareas = sc.nextLine();
                System.out.println("introduzca el nombre de la tarea , la descripcion de la tarea y su estado (pendiente o completada) separando por '-'");
                tareas = sc.nextLine();
                datos = tareas.split("-");
                base.add(new Tarea(datos[0], datos[1], datos[2]));




            }
            if(act==1) {
                for (int i = 0; i < base.size(); i++) {
                    Tarea tarea = (Tarea) base.get(i);
                    if(tarea.getEstado().equals("Pendiente")){
                        System.out.println(base.get(i));
                    }

                }
            }
            if(act==2) {
                System.out.println( "");
                tareas = sc.nextLine();
                System.out.println( "nombre de la tarea ");
                tareas = sc.nextLine();
                Tarea d ;
                String n_est;
                for (int i = 0; i < base.size(); i++) {
                    d = (Tarea) base.get(i);
                    if(d.getNombre().equals(tareas)){
                        System.out.println(d +" introduzca el nuevo estado" );
                        n_est = sc.nextLine();
                        d.setEstado(n_est);
                        base.remove(i);
                        base.add(d);
                    }

                }

            }
            if(act==3) {
                System.out.println( "");
                tareas = sc.nextLine();
                System.out.println( "nombre de la tarea ");
                tareas = sc.nextLine();
                Tarea d ;
                for (int i = 0; i < base.size(); i++) {
                    d = (Tarea) base.get(i);
                    if(d.getNombre().equals(tareas)){
                        base.remove(i);
                    }
                }

            }
            if(act==4) {

                for (int i = 0; i < base.size(); i++) {
                    System.out.println(base.get(i));
                }
            }
            if(act==5){fin =true;}

    }
    }
}