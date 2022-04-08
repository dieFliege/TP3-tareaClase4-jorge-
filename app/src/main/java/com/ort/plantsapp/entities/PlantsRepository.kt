package com.ort.plantsapp.entities

class PlantsRepository {

    var plantsList : MutableList<Plant> = mutableListOf()

    init {
        plantsList.add(Plant("Callitropsis nootkatensis", "Árbol ornamental", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/14252940_dc_web_01_17032022132627.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Acacia arabica", "Árbol ornamental", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23082018102155_ashampoo_snap_2018_08_23_12h20m50s_006_.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Acacia baileyana", "Árbol ornamental", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/14331726_dc_web_01_15112021122759.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Acacia baileyana 'Purpurea'", "Árbol ornamental", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23082018102257_ashampoo_snap_2018_08_23_12h21m37s_007_.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Acacia cultriformis", "Árbol ornamental", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23082018102405_ashampoo_snap_2018_08_23_12h22m50s_008_.jpg&w=269&h=216&q=95"))

        plantsList.add(Plant("Adenium obesum", "Cactus o crasa (suculenta)", ""))
        plantsList.add(Plant("Aeonium arboreum", "Cactus o crasa (suculenta)", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/30062011172918_adenium-obesum189295.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agave americana", "Cactus o crasa (suculenta)", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/22022011151917_002_cac.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agave americana 'Mediopicta'", "Cactus o crasa (suculenta)", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23012012094940_agave-americana-variegata_14139350.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agave americana 'Variegata'", "Cactus o crasa (suculenta)", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/CAC_003.jpg&w=269&h=216&q=95"))

        plantsList.add(Plant("Acidanthera murielae", "Planta bulbosa", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/BUL_059.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agapanthus africanus", "Planta bulbosa", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/VIV_011.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agapanthus africanus 'Albus'", "Planta bulbosa", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23122010135818_319512-nr.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agapanthus africanus 'Blau'", "Planta bulbosa", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23082018122710_ashampoo_snap_2018_08_23_14h25m27s_053_.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Agapanthus africanus 'Silver Baby'", "Planta bulbosa", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23012012093929_agapanthus-silver-baby_14123091.jpg&w=269&h=216&q=95"))

        plantsList.add(Plant("Rosa pimpinellifolia", "Rosal", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/22082018105254_14316851_wm.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Rosa rugosa", "Rosal", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/22082018104634_14265576_wm.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Rosa sempervirens", "Rosal", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/22082018104504_ashampoo_snap_2018_08_22_12h44m05s_010_.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Rosa sp.", "Rosal", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/23022012084343_ill_-roses-halfproduct-rosa_14113908.jpg&w=269&h=216&q=95"))
        plantsList.add(Plant("Rosa sp. 'Camelia'", "Rosal", "https://www.guiaverde.com/inc/timthumb.php?src=../files/plant/ROS_020.jpg&w=269&h=216&q=95"))
    }

}