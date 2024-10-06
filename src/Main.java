import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minusclient = 0;
        int colonka = input.nextInt();
        int[] zapravka = new int[colonka];
        ArrayList<Avtomobil> ozered = new ArrayList<Avtomobil>();
        int Timespace = 360;
        Random rand = new Random();
        Avtomobil MainAvtoCreator = new Avtomobil();
        int Timework = 0;
        int zisterna = 100000;
        int u = 0;
        int t = 0;
        int mashinapoavilacvsego = 1;
        int minusklnow = 0;
        int mashinpovnow = 1;
        boolean delt = true;
        int rd = 3;
        //Утром
//        for(int i = 1; i < Timespace; i++) {
//            if(rand.nextInt(3) == 1) {
//                ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
//                if(ozered.isEmpty()) {
//                    continue;
//                }
//                for(int x = 0; x < colonka; x++) {
//                    if(zapravka[x] != 0) {
//                        zapravka[x] -= 1;
//                    }
//                    if (zapravka[x] == 0) {
//                        zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
//                        ozered.remove(0);
//                        break;
//                    } else {
//                        int[] massiv = new int[ozered.size()];
//                        for (int c = 0; c < ozered.size(); c++) {
//                            ozered.get(c).delay += 1;
//                            if (ozered.get(c).delay > 12) {
//                                minusclient += 1;
//                                massiv[c] = c;
//                            }
//                            for (int v = 0; v < ozered.size(); v++) {
//                                if(massiv[v] != 0) {
//                                    ozered.remove(massiv[v]);
//                                    massiv[v] = 0;
//                                }
//                            }
//
//
//                        }
//                    }
//                }
//            }
//
//        }
//        System.out.println(Timespace + " " + minusclient + " " + ozered.size());
//        //День
//        for(int i = 1; i < Timespace; i++) {
//            if(rand.nextInt(2) == 1) {
//                ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
//                if(ozered.isEmpty()) {
//                    continue;
//                }
//                for(int x = 0; x < colonka; x++) {
//                    if(zapravka[x] != 0) {
//                        zapravka[x] -= 1;
//                    }
//                    if (zapravka[x] == 0) {
//                        zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
//                        ozered.remove(0);
//                        break;
//                    } else {
//                        int[] massiv = new int[ozered.size()];
//                        for (int c = 0; c < ozered.size(); c++) {
//                            ozered.get(c).delay += 1;
//                            if (ozered.get(c).delay > 12) {
//                                minusclient += 1;
//                                massiv[c] = c;
//                            }
//                            for (int v = 0; v < ozered.size(); v++) {
//                                if(massiv[v] != 0) {
//                                    ozered.remove(massiv[v]);
//                                    massiv[v] = 0;
//                                }
//                            }
//
//
//                        }
//                    }
//                }
//            }
//
//        } System.out.println(Timespace + " " + minusclient + " " + ozered.size());
//        for(int i = 1; i < Timespace; i++) {
//            if(rand.nextInt(4) == 1) {
//                ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
//                if(ozered.isEmpty()) {
//                    continue;
//                }
//                for(int x = 0; x < colonka; x++) {
//                    if(zapravka[x] != 0) {
//                        zapravka[x] -= 1;
//                    }
//                    if (zapravka[x] == 0) {
//                        zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
//                        ozered.remove(0);
//                        break;
//                    } else {
//                        int[] massiv = new int[ozered.size()];
//                        for (int c = 0; c < ozered.size(); c++) {
//                            ozered.get(c).delay += 1;
//                            if (ozered.get(c).delay > 12) {
//                                minusclient += 1;
//                                massiv[c] = c;
//                            }
//                            for (int v = 0; v < ozered.size(); v++) {
//                                if(massiv[v] != 0) {
//                                    ozered.remove(massiv[v]);
//                                    massiv[v] = 0;
//                                }
//                            }
//
//
//                        }
//                    }
//                }
//            }
//
//        } System.out.println(Timespace + " " + minusclient + " " + ozered.size());
        ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
        while(ozered.size() != 0 || delt) {
            for(int time = 0; time < 4; time++){
                if (time == 0 || time == 3) {
                    rd = 4;
                } else {
                    rd = 3;
                }
                for(int i = 0; i < Timespace; i++) {
                    if (zisterna <= 10000) {
                        if (Timespace - i < 30 && u == 0) {
                            if(zisterna == 0) {
                                if(rand.nextInt(1, rd) == 1) {
                                    ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(100), rand.nextDouble(10, 100), rand.nextDouble(20, 80)));
                                    mashinapoavilacvsego += 1;
                                    mashinpovnow += 1;
                                }
                                int[] massiv = new int[ozered.size()];
                                for (int c = 0; c < ozered.size(); c++) {
                                    ozered.get(c).delay += 1;
                                    if (ozered.get(c).delay > 12) {
                                        minusclient += 1;
                                        minusklnow += 1;
                                        massiv[c] = c;
                                    }
                                }
                                for (int v = 0; v < ozered.size(); v++) {
                                    if (massiv[v] != 0) {
                                        ozered.remove(massiv[v]);
                                        massiv[v] = 0;
                                    }
                                }
                                continue;
                            }
                        } else if (u == 30) {
                            zisterna = 100000;
                            System.out.println("Заправились");
                            u = 0;
                        } else if (zisterna == 0) {
                            if(rand.nextInt(1, rd) == 1) {
                                mashinapoavilacvsego += 1;
                                mashinpovnow += 1;
                                ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
                            }
                            u += 1;
                            int[] massiv = new int[ozered.size()];
                            for (int c = 0; c < ozered.size(); c++) {
                                ozered.get(c).delay += 1;
                                if (ozered.get(c).delay > 12) {
                                    minusclient += 1;
                                    minusklnow += 1;
                                    massiv[c] = c;
                                }
                            }
                            for (int v = 0; v < ozered.size(); v++) {
                                if (massiv[v] != 0) {
                                    ozered.remove(massiv[v]);
                                    massiv[v] = 0;
                                }
                            }
                            continue;
                        } else {
                            u += 1;
                        }
                    }
                    if(rand.nextInt(1, rd) == 1) {
                        mashinapoavilacvsego += 1;
                        mashinpovnow += 1;
                        ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
                    }
                        if(ozered.isEmpty()) {
                            continue;
                        }
                        for(int x = 0; x < colonka; x++) {
                            if(zapravka[x] != 0) {
                                zapravka[x] -= 1;
                            }
                            if (zapravka[x] == 0) {
                                if (zisterna < (int) (ozered.get(0).ckokotlit)) {
                                    zapravka[x] = zisterna / 20;
                                    zisterna = 0;
                                } else {
                                    zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
                                    zisterna -= (int) (ozered.get(0).ckokotlit);
                                    ozered.remove(0);
                                    break;
                                }
//                                zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
//                                zisterna -= (int) (ozered.get(0).ckokotlit);
//                                ozered.remove(0);
//                                break;
                            } else {
                                int[] massiv = new int[ozered.size()];
                                for (int c = 0; c < ozered.size(); c++) {
                                    ozered.get(c).delay += 1;
                                    if (ozered.get(c).delay > 12) {
                                        minusclient += 1;
                                        minusklnow += 1;
                                        massiv[c] = c;
                                    }
                                    for (int v = 0; v < ozered.size(); v++) {
                                        if(massiv[v] != 0) {
                                            ozered.remove(massiv[v]);
                                            massiv[v] = 0;
                                        }
                                    }


                                }
                            }
                        }


                }
                System.out.println(Timework + " " + mashinapoavilacvsego + " " + minusclient + " " + ozered.size() + " " + mashinpovnow + " " + minusklnow);
                mashinpovnow = 0;
                minusklnow = 0;
            }
//            for(int i = 1; i < Timespace; i++) {
//                if(rand.nextInt(rand.nextInt(2, 4)) == 1) {
//                    ozered.add(MainAvtoCreator.Avtomobilcreator(rand.nextInt(800), rand.nextDouble(10, 100), rand.nextDouble(20, 600)));
//                    if(ozered.isEmpty()) {
//                        continue;
//                    }
//                    for(int x = 0; x < colonka; x++) {
//                        if(zapravka[x] != 0) {
//                            zapravka[x] -= 1;
//                        }
//                        if (zapravka[x] == 0) {
//                            zapravka[x] = (int) (ozered.get(0).ckokotlit / 20);
//                            ozered.remove(0);
//                            break;
//                        } else {
//                            int[] massiv = new int[ozered.size()];
//                            for (int c = 0; c < ozered.size(); c++) {
//                                ozered.get(c).delay += 1;
//                                if (ozered.get(c).delay > 12) {
//                                    minusclient += 1;
//                                    massiv[c] = c;
//                                }
//                                for (int v = 0; v < ozered.size(); v++) {
//                                    if(massiv[v] != 0) {
//                                        ozered.remove(massiv[v]);
//                                        massiv[v] = 0;
//                                    }
//                                }
//
//
//                            }
//                        }
//                    }
//                }
//
//            }
//            System.out.println(Timespace + " " + minusclient + " " + ozered.size());
            Timework += 1;
            if(Timework % 2 == 0) {
                if(minusclient - t != 0 && !ozered.isEmpty()) {
                colonka += 1;
                int[] newzapravka = Arrays.copyOf(zapravka, colonka);
                zapravka = newzapravka;
                System.out.println("Теперь колл колонок: " + colonka);
            }
            }
            if(minusclient - t == 0) {
                delt = false;
            } else { delt = true; }
            t = minusclient;

        }

    }
}