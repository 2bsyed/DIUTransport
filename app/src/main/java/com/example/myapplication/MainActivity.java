package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TimePicker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class R1 {
    String[] location={"Dhanmondi - Sobhanbag","Shyamoli Square","Technical Mor","Majar Road Gabtoli","Konabari Bus Stop","Eastern Housing","Rupnagar","Birulia Bus Stand","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Labbayek","Labbayek","Labbayek","Labbayek","Alif","Labbayek","Labbayek","Alif","Alif","Laguna","Laguna","Riksha"};
    int[] time={700,1000,1500,1715};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R2{
    String[] location={"Uttara - Rajlokkhi","Uttara - Rajlokkhi","House building","Grand Zamzam Tower","Matro Rail","Diyabari Bridge","Beribadh","Birulia","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Bkash","Bkash","Bkash","Itihas","Bkash","Bkash","Bkash","Bkash","Laguna","Riksha"};
    int[] time={700,1000};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R3{
    String[] location={"Tongi College Gate Bus Stand","Kamar Para","Dhour","Birulia","Diyabari Bridge","Beribadh","Birulia","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Laguna","Riksha"};
    int[] time={700,1000,1500};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R4{
    String[] location={"ECB Chattor","Kalshi More","Mirpur 12","Mirpur 10","Mirpur 02","Mirpur 01 - Sony Cinema Hall","Commerce College","Gudaraghat","Beribadh","📍Daffodil Smart City"};
    String[] lbus={"Labbayek","Labbayek","Labbayek","Labbayek","Alif","Labbayek","Labbayek","Labbayek","Alif","Laguna"};
    int[] time={700,1000};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R5{
    String[] location={"Konabari Pukur Par ","Norshingpur","Ghosbag","Zirabo","Ashulia Bazar","Paragram","📍Daffodil Smart City"};

    String[] lbus={"Alif","Alif","Ali Noor","Alif","Ali Noor","Alif","Riksha"};
    int[] time={700};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R6{
    String[] location={"Baipail","Polli Biddut","Nabinagar","Bismail","Paragram","📍Daffodil Smart City"};
    String[] lbus={"Alif","Alif","Ali Noor","Alif","Ali Noor","Riksha"};
    int[] time={700};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R7{
    String[]location={"Dhamrai Bus Stand","Kohinur Market","Gonosastho","Nabinagar","Bismail","Prantik","JU","C&B","Kolma","Charabag","Kumkumari","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Prattoy Transport Co. Limited","Prattoy Transport Co. Limited","Prattoy Transport Co. Limited","Prattoy Transport Co. Limited","Etihas Transport Limited","Etihas Transport Limited","Etihas Transport Limited","Leguna","Leguna","Leguna","Leguna","Leguna","Riksha"};
    int[] time={700,1000};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R8{
    String[] location={"Savar Bus Stand","Radio Colony","C&B","Kolma","Charabag","Kumkumari","Khagan","📍Daffodil Smart City"};

    String[] lbus={"Etihas Transport Limited","Etihas Transport Limited","Etihas Transport Limited","Leguna","Leguna","Leguna","Leguna","Riksha"};
    int[] time={700,1000};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R9{
    String[] location={"Chasara","sign board","sonir akhra","saydabad bus stand","gulistan","Chankharpul","Nilkhet","New Market","kolabagan","Dhanmondi-Sobhanbag","Shyamoli Square","Technical Mor","Majar Road Gabtoli","Konabari Bus Stop","Eastern Housing Rup Nogor","Birulia Bus Stand","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Ananda Paribahan","iqbal","Meghaloy Paribahan","Utshab Transport","Nilachal Express","Nilachal Express","Nilachal Express","Nilachal Express","Nilachal Express","Dishari Paribahan","Welcome Transport","Dishari Paribahan","rickshaw","Kironmala Paribahan Limited","Kironmala Paribahan Limited","Leguna","Riksha"};
    int[] time={620};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }

}
class R10{
    String[] location={"Green Model Town","Bashabo","Malibagh Railgate South Bus Stop","Rampura Bazaar Bus Stop","BTV Center","Aftabnagar","Badda Suvastu tower","Jamuna Furute Park","Kuril Bisso Road","Khilkhet","Uttara - Rajlokkhi","House building","Diyabari Bridge","Beribadh","Birulia","Khagan","Akran Bazaar Bus Stand","Khagan","📍Daffodil Smart City"};
    String[] lbus={"Raida Enterprise","Raida Enterprise","Raida Enterprise","Raida Enterprise","Rajdhani Super Service","Raida Enterprise","Raida Enterprise","Raida Enterprise","Raida Enterprise","Raida Enterprise","Raida Enterprise","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Sotabdi Paribahan Limited","Leguna","Leguna","Leguna","Leguna","Riksha"};
    int[] time={620};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }

}
class R11{
    String[] location={"Mirpur Konabari Bus Stop","Sony Cinema Hall","Gudaraghat","Beribadh","Estern Housing","Birulia","Akran","khagan","📍Daffodil Smart City"};
    String[] lbus={"Alif Enterprise","Riksha","Drutojan Express","Alif Enterprise","Alif Enterprise","Leguna","Leguna","Leguna","Riksha"};
    int[] time={700,830,1000,1100,1230};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(timeIn)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}
class R12{
    String[] location={"Uttara Khalpar Diyabari Bridge","Beribadh","Birulia","Khagan","📍Daffodil Smart City"};

    String[] lbus={"Alif Enterprise","Leguna","Leguna","Leguna","Riksha"};
    int[] time={700,830,1000,1100,1230};
    String showtxt="";
    int lindex= location.length;
    int tindex= time.length;
    int stime=0,slocation=999;
    public  String getTime(int number) {
        // Convert the integer to a string
        String strNumber = Integer.toString(number);

        // Check if the length is greater than or equal to 2
        if (strNumber.length() >= 2) {
            // Extract the substring excluding the last two characters
            String firstPart = strNumber.substring(0, strNumber.length() - 2);

            // Extract the last two characters
            String lastTwoDigits = strNumber.substring(strNumber.length() - 2);

            // Concatenate the first part, ":", and the last two digits
            return "🕑"+firstPart + ":" + lastTwoDigits;
        } else {
            // If the length is less than 2, just return the string as is
            return strNumber;
        }
    }
    public  String run(int timeIn,String locationIn){
        for(int i: time){
            if(Math.abs(i-timeIn)<=15){
                stime=i;
                break;
            }
        }
        for(int i=0;i<lindex;i++){
            if(location[i].equals(locationIn)){
                slocation=i;
            }
        }
        if(slocation!=999){
            if(stime!=0){
                showtxt="🚎DIU Bus\n"+getTime(stime)+"\n";
                for(int i=slocation;i<lindex;i++) {
                    showtxt+=location[i]+"➡️";
                }
            }
            else{
                for(int i=slocation;i<lindex;i++){
                    write:
                    {
                        if (i != slocation){
                            if (lbus[i - 1].equals(lbus[i])) {
                                break write;
                            }
                        }
                        showtxt+="\n"+"🚍"+lbus[i]+"\n";
                    }
                    showtxt+=location[i]+"➡️";
                }
            }
        }
        return showtxt;
    }
}

public class MainActivity extends AppCompatActivity {
    private ImageButton button;
    R1 r1;
    R2 r2;
    R3 r3;
    R4 r4;
    R5 r5;
    R6 r6;
    R7 r7;
    R8 r8;
    R9 r9;
    R10 r10;
    R11 r11;
    R12 r12;
    EditText time,location;
    public String timeIn,locationIn,showtxt="Hello";
    AutoCompleteTextView autoCompleteTextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=findViewById(R.id.editTextText2);
        String[] itemArray= getResources().getStringArray(R.array.Location);
        ArrayAdapter<String>arrayAdapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,itemArray);
        autoCompleteTextView.setAdapter(arrayAdapter);
        TimePicker simpleTimePicker=(TimePicker)findViewById(R.id.simpleTimePicker); // initiate a time picker
        simpleTimePicker.setIs24HourView(true);
// set the value for current hours
        //simpleTimePicker.setCurrentHour(5); // before api level 23

        //time=(EditText) findViewById(R.id.editTextTime3);
        location=(EditText) findViewById(R.id.editTextText2);
        r1 = new R1();
        r2 = new R2();
        r3 = new R3();
        r4 = new R4();
        r5 = new R5();
        r6 = new R6();
        r7 = new R7();
        r8 = new R8();
        r9 = new R9();
        r10 = new R10();
        r11 = new R11();
        r12 = new R12();

        button= (ImageButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int hours =simpleTimePicker.getHour();
                int minutes = simpleTimePicker.getMinute();
                String formattedNum1 = String.format("%02d", hours);
                String formattedNum2 = String.format("%02d", minutes);

                // Concatenate the formatted strings
                String timeIn = formattedNum1 + formattedNum2;
                int timein=Integer.parseInt(timeIn);
                //timeIn=time;
                locationIn=location.getText().toString();
                //int timein=Integer.parseInt(timeIn);

                lebel: {
                    showtxt=r1.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r2.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r3.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r4.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r5.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r6.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r7.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r8.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r9.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r10.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r11.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                    showtxt=r12.run(timein,locationIn);
                    if(!showtxt.isEmpty()) break lebel;
                }

                openActivity2();
            }
        });

    }
    public void openActivity2(){
        Intent Intent = new Intent(this, MainActivity2.class);
        Intent.putExtra("txt",showtxt);
        startActivity(Intent);


    }
}