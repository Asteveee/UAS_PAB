package com.if3b.projekpab;

import java.util.ArrayList;

public class DataItem {
    public static String data [][] = new String[][]{
            {"Mixue PSX Mall", "Ice cream shop\n" +
                    "Service options: Dine-in · Takeaway · No-contact delivery\n" +
                    "Located in: Palembang Square\n" +
                    "Address: 2PFV+83V, Lorok Pakjo, Ilir Barat I, Palembang City, South Sumatra 30121\n" +
                    "Hours: \n" +
                    "Monday\t9AM–9PM\n" +
                    "Tuesday\t9AM–9PM\n" +
                    "Wednesday\t9AM–9PM\n" +
                    "Thursday\t9AM–9PM\n" +
                    "Friday\t9AM–9PM\n" +
                    "Saturday\t9AM–9PM\n" +
                    "Sunday\t9AM–9PM\n" +
                    "Suggest new hours\n" +
                    "Phone: 0822-8887-2226\n" +
                    "Order: gofood.co.id", "https://lh5.googleusercontent.com/p/AF1QipM9L_FIWL_uH70W_5rdmzbjsQUNW5p0fjyjQG3M=w408-h306-k-no"},
            {"Mixue PTC", "Service options: Dine-in · Takeaway · No-contact delivery\n" +
                    "Address: PTC area parking, Jl. R. Sukamto, Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30164\n" +
                    "Hours: \n" +
                    "Monday\t10AM–10PM\n" +
                    "Tuesday\t10AM–10PM\n" +
                    "Wednesday\t10AM–10PM\n" +
                    "Thursday\t10AM–10PM\n" +
                    "Friday\t10AM–10PM\n" +
                    "Saturday\t10AM–10PM\n" +
                    "Sunday\t10AM–10PM\n" +
                    "Suggest new hours\n" +
                    "Phone: 0812-5206-5618 ", "https://lh5.googleusercontent.com/p/AF1QipMIcZMrvgub6fHKsT5Cut3TRJ1B1w9L6hUKHd9_=w408-h306-k-no"},
            {"Mixue PIM", "Service options: Dine-in · Takeaway\n" +
                    "Address: Jl. Letkol Iskandar No.18, 24 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30134\n" +
                    "Hours: \n" +
                    "Monday\t10AM–9PM\n" +
                    "Tuesday\t10AM–9PM\n" +
                    "Wednesday\t10AM–9PM\n" +
                    "Thursday\t10AM–9PM\n" +
                    "Friday\t10AM–9PM\n" +
                    "Saturday\t10AM–9PM\n" +
                    "Sunday\t10AM–9PM ", "https://lh5.googleusercontent.com/p/AF1QipMRTlDeS4i7Pcs_DoGFDuLotyGXQ39YQ8EkGf4=w203-h270-k-no"},
            {"Mixue Mayor Ruslan", "Ice cream shop\n" +
                    "Service options: Dine-in · Takeaway · Delivery\n" +
                    "Address: Jl. Mayor Ruslan, 9 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30114\n" +
                    "You visited in October 2022\n" +
                    "Hours: \n" +
                    "Monday\t9AM–9PM\n" +
                    "Tuesday\t9AM–9PM\n" +
                    "Wednesday\t9AM–9PM\n" +
                    "Thursday\t9AM–9PM\n" +
                    "Friday\t9AM–9PM\n" +
                    "Saturday\t9AM–9PM\n" +
                    "Sunday\t9AM–9PM", "https://lh5.googleusercontent.com/p/AF1QipPtFO6v-vRC9FlFuJyvlnjBde2Gdej1yUJn9GWX=w203-h270-k-no"},
            {"Mixue Celentang", "Ice cream shop\n" +
                    "Service options: Dine-in · Takeaway\n" +
                    "Address: 3Q3P+H6W, Jl. Brigjen Hasan Kasim, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30196\n" +
                    "Hours: \n" +
                    "Open now", "https://lh5.googleusercontent.com/p/AF1QipNius8_wV193J-cssX6VZhMLO-QzJfwaJVUNWS1=w600-h988-p-k-no"},
            {"Mixue GOLF", "Ice cream shop\n" +
                    "Service options: Dine-in · Takeaway\n" +
                    "A 3-min walk from Furū Tea, Calais Nu & Hot Star Large Fried Chicken Palembang\n" +
                    "Address: 2QQ9+8X4, Duku, Ilir Timur II, Palembang City, South Sumatra", "https://lh5.googleusercontent.com/p/AF1QipP_3mo4W6or-EfAYGT-7mK21grHNid-hBnX-2Pv=w203-h360-k-no"},
            {"Mixue Kapt A Rivai", "Ice cream shop\n" +
                    "Service options: Dine-in · Takeaway\n" +
                    "Address: Jl. Kapten A. Rivai No.163, 26 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30135\n" +
                    "Hours: \n" +
                    "Monday\t9AM–9:30PM\n" +
                    "Tuesday\t9AM–9:30PM\n" +
                    "Wednesday\t9–9:30AM\n" +
                    "Thursday\t9AM–9:30PM\n" +
                    "Friday\t9AM–10PM\n" +
                    "Saturday\t9AM–10PM\n" +
                    "Sunday\t9AM–10PM\n" +
                    "Updated by this business 9 weeks ago\n" +
                    "Suggest new hours\n" +
                    "Phone: 0819-4463-1125\n", "https://lh5.googleusercontent.com/p/AF1QipPSCpRfLcCmAHlCMUTbCBR-Rx36Yx1vjWv0Hr5z=w203-h152-k-no"},
            {"Mixue Bukit Unsri", "Service options: Takeaway\n" +
                    "Address: Jl. Srijaya Negara No.151, Bukit Lama, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30128", "https://lh5.googleusercontent.com/p/AF1QipOvssjF61JeiU1ZlxfNkxBJrWOhJEUw6ULwcKU=w203-h270-k-no"},
            {"Mixue Wongkito Sekip", "Ice cream shop\\n\" +" +
                    " Service options: Takeaway\n" +
                    "Address: Lawang Kidul, Ilir Timur II, Palembang City, South Sumatra\n" +
                    "Phone: 0821-8246-1211", "https://lh5.googleusercontent.com/p/AF1QipPQJwF8RJrLdknV7fC7JkNtsYBRKw_VGO2ty8Zk=w203-h270-k-no"},
            {"Mixue Sako Kenten", "Ice cream shop\\n\" +" +
                    "Service options: Dine-in · Takeaway\n" +
                    "Address: Jl. Siaran No.750, RT.14/RW.06, Sako Baru, Kec. Sako, Kota Palembang, Sumatera Selatan 30961", "https://lh5.googleusercontent.com/p/AF1QipO8xZuHv1IksGJ0hfLpQ9yCgU_z3Fjm7dFQluey=w203-h114-k-no"}
    };

    public static ArrayList<ModeMixue> ambilDataMixue() {
        ArrayList<ModeMixue> dataAlamat = new ArrayList<>();
        for (String[] varData : data) {
            ModeMixue model = new ModeMixue();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataAlamat.add(model);
        }

        return dataAlamat;
    }
}
