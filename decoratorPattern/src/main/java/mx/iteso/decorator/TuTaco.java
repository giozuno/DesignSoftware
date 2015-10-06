package mx.iteso.decorator;

import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.Camaron;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.tacos.TacoNormal;

public class TuTaco {
    public static void main(String[] args) {
        Taco tacoLengua = new TacoNormal(Taco.MINI);
        tacoLengua = new TortillaMaiz(tacoLengua);
        tacoLengua = new Lengua(tacoLengua);
        tacoLengua = new Cebolla(tacoLengua);
        tacoLengua = new Cilantro(tacoLengua);

        System.out.println();
        System.out.println(tacoLengua.getDescription() + " " + tacoLengua.getSize());
        System.out.println("$" + tacoLengua.cost() + " MXN");

        Taco tacoPescado = new TacoNormal(Taco.MEGA);
        tacoPescado = new TortillaHarina(tacoPescado);
        tacoPescado = new Camaron(tacoPescado);

        System.out.println();
        System.out.println(tacoPescado.getDescription() + " " + tacoPescado.getSize());
        System.out.println("$" + tacoPescado.cost() + " MXN");

        Taco tacoCamaron = new TacoNormal(Taco.REGULAR);
        tacoCamaron = new TortillaHarina(tacoCamaron);
        tacoCamaron = new Camaron(tacoCamaron);

        System.out.println();
        System.out.println(tacoCamaron.getDescription() + " " + tacoCamaron.getSize());
        System.out.println("$" + tacoCamaron.cost() + " MXN");

        /*
        Taco taco2 = new TacoNormal();

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new Quesadilla();

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");
        */
    }
}
