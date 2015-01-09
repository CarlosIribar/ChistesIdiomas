package com.iribar.carlos.myapplication;

import java.util.Random;

/**
 * Created by Carlos Iribar on 07/01/2015.
 */
public class ListaChistes {

    private String[][] chistes = {{"en chino ?","99","cachichen"},
                               {"en chino ?","papel higénico","kita kakita"},
            {"en japonés ?","papel higénico","sakakaka"},
            {"en chino ?","pobre","chin lu, chin agua, chin gas"},
            {"en alemán ?","suegra","estorrrrrvo"},
            {"en chino ?","pañuelo","jita moquito"},
            {"en japonés ?","mi moto no sirve","yamimoto nokamina"},
            {"en chino ?","viuda","chin chu leño"},
            {"en japónes ?","encendedor","sakayama"},
            {"en ruso ?","flaco","skeletov"},
            {"en africano ?","diarréa","abundalacaca"},
            {"en africano ?","pegar","tetumbo lacara"},
            {"en árabe ?","beso","mojame la jeta"},
            {"en árabe ?","salivar","ali-ba-la-baba"},
            {"en japonés ?","banquero","pa-ga-ya"},
            {"en japonés ?","espejo","ai toy"},
            {"en chino ?","verse en el espejo","aki toi yo"},
            {"en chino ?","ruta","chiuuuuunnn"},
            {"en chino ?","náufrago","chin-chu-lancha"},
            {"en chino ?","fósforo","sakallama"},
            {"en chino ?","101","che-pa-cho"},
            {"en alemán ?","ascensor","suben-bajen"},
            {"en árabe ?","disparar","ali ba la bala"},
            {"en árabe ?","ametralladora","ali ba la bala bala bala..."},
            {"en árabe ?","cañon","ali ba la balota"},
            {"en chino ?","húerfano","chin-chu-mama"},
            {"en árabe ?","ascensor","ali baba"},
            {"en alemán ?","llueve","gotascaen"},
            {"en japónes ?","auto roto","ta rota la toyota"},
            {"en chino ?","sucio","chin chan pu"},
            {"en japónes ?","dentista","tecuro tuocico"},
            {"en japónes ?","mal jugador","nitoka pelota"},
            {"en italiano ?","bigote","trampolini di moco"},
            {"en francés ?","tren mató a un perro","le chuchu mato le guao guau"},
            {"en alemán ?","abrán la puerta","destranken"},
            {"en alemán ?","subir al autobús","suban-empujen-estrujen-bajen"},
            {"en alemán ?","bombardeo","bombascaen"},
            {"en alemán ?","político","suben-destruyen-afan-rajen"},
            {"en alemán ?","sin afeitarse","barbarien"},
            {"en árabe ?","agricultor","jala la pala"},
            {"en árabe ?","beso","saliva-va-saliva-viene"},
            {"en árabe ?","tiroteo","bala-va bala-viene"},
            {"en chino ?","cerdo","chan chi to"},
            {"en chino ?","descalzo","chin chinela"},
            {"en chino ?","despeinada","chin chu peine"},
            {"en chino ?","embarazo","ta hinchaa"},
            {"en chino ?","muy largo","chin-fin"},
            {"en chino ?","intestino","chin-chu-lin"},
            {"en chino ?","suspenso","cha cha cha chaaaan"},
            {"en francés ?","me equivoqué","le pifié"},
            {"en griego ?","caricatura","garabatos"},
            {"en inglés ?","repollo","re chicken"},
            {"en italiano ?","Il avini di la habitazioni"},
            {"en japónes ?","adiviniador","komosabe"},
            {"en japónes ?","al contado","taka-taka"},
            {"en japónes ?","café amargo","takara-lazucar"},
            {"en japónes ?","fin","saka-bo"},
            {"en japónes ?","muerto","ta-tieso"},
            {"en japónes ?","accidente","popoko-memato"},
            {"en japónes ?","se fue","no-ta"},
            {"en portugués ?","bigote","alfombra du moco"},
            {"en portugués ?","calvicie","aeroporto dos mosquitos"},
            {"en portugués ?","rodilla","bisagra du gamba"},
            {"en rumano ?","sediento","meresku refresku"},
            {"en ruso ?","conjunto de árboles","boshke"},
            {"en ruso ?","insecto","moshka"},
            {"en ruso ?","volar en avión","simecaigo patatof"},
            {"en africano ?","trampa en el casino","ubotongo enlatimba"},
            {"en africano ?","lluvia","mojaconagua lanuca"},
            {"en africano ?","no estoy de acuerdo","m'opongo"},
            {"en africano ?","transpirar","tubaranda metumba"},
            {"en africano ?","oferta","ganga"},
            {"en africano ?","mal aliento","tutufo metumba"},
            {"en alemán ?","trueno","nubeskrugen"}







    };


    public String idioma;
    public String pregunta;
    public String respuesta;

    public void getChiste() {

        Random random = new Random();
        int elegido = random.nextInt(chistes.length);

        idioma= getIdioma(elegido);
        pregunta=getPregunta(elegido);
        respuesta=getRespuesta(elegido);





    }

    private String getIdioma(int elegido) {

        return chistes[elegido][0];
    }

    private String getPregunta(int elegido) {

        return chistes[elegido][1];
    }

    private String getRespuesta(int elegido) {

        return chistes[elegido][2];
    }

}
