package X;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: X.7qw  reason: invalid class name and case insensitive filesystem */
public class C161987qw {
    public static HashSet A00 = AnonymousClass002.A0K();
    public static TreeMap A01 = new TreeMap(new AnonymousClass8NL());
    public static TreeMap A02 = new TreeMap(new AnonymousClass8NL());
    public static TreeMap A03 = new TreeMap();

    static {
        A00.add("à");
        A00.add("at");
        A00.add("MEZ");
        A00.add("Uhr");
        A00.add("h");
        A00.add("pm");
        A00.add("PM");
        A00.add("am");
        A00.add("AM");
        A00.add("min");
        A00.add("um");
        A00.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            A03.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
                String[] months = instance.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        A04(Integer.valueOf(i), months[i], A02);
                    }
                }
                String[] shortMonths = instance.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        TreeMap treeMap = A02;
                        String str3 = shortMonths[i2];
                        Integer valueOf = Integer.valueOf(i2);
                        A04(valueOf, str3, treeMap);
                        A04(valueOf, shortMonths[i2].replace(".", ""), A02);
                    }
                }
                String[] weekdays = instance.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str4 = weekdays[i3];
                    if (str4.length() != 0) {
                        TreeMap treeMap2 = A01;
                        Integer valueOf2 = Integer.valueOf(i3);
                        A04(valueOf2, str4, treeMap2);
                        A04(valueOf2, str4.replace(".", ""), A01);
                    }
                }
                String[] shortWeekdays = instance.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str5 = shortWeekdays[i4];
                    if (str5.length() != 0) {
                        TreeMap treeMap3 = A01;
                        Integer valueOf3 = Integer.valueOf(i4);
                        A04(valueOf3, str5, treeMap3);
                        A04(valueOf3, str5.replace(".", ""), A01);
                    }
                }
            }
        }
    }

    public static String A01(String str, Calendar calendar, StringTokenizer stringTokenizer) {
        while (true) {
            TimeZone timeZone = (TimeZone) A03.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
            } else if (!A00.contains(str)) {
                return str;
            } else {
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
            }
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            str = stringTokenizer.nextToken();
        }
    }

    public static GregorianCalendar A03() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = gregorianCalendar.getTimeZone();
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis((long) (-timeZone.getRawOffset()));
        return gregorianCalendar;
    }

    public static Integer A00(String str) {
        if (Character.isDigit(AnonymousClass6C9.A00(str))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = (Integer) A02.get(str);
        if (num != null) {
            return num;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("can not parse ");
        A0o.append(str);
        throw AnonymousClass0x2.A0V(" as month", A0o);
    }

    public static Date A02(String str, Calendar calendar, StringTokenizer stringTokenizer) {
        String A012;
        String A013;
        String A014;
        calendar.set(11, Integer.parseInt(A01(str, calendar, stringTokenizer)));
        if (stringTokenizer.hasMoreTokens() && (A012 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
            calendar.set(12, Integer.parseInt(A012));
            if (stringTokenizer.hasMoreTokens() && (A013 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
                calendar.set(13, Integer.parseInt(A013));
                if (stringTokenizer.hasMoreTokens() && (A014 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
                    String A015 = A01(A014, calendar, stringTokenizer);
                    if (A015.length() == 4 && Character.isDigit(AnonymousClass6C9.A00(A015))) {
                        int parseInt = Integer.parseInt(A015);
                        if (parseInt < 100) {
                            if (parseInt > 30) {
                                parseInt += 2000;
                            } else {
                                parseInt += 1900;
                            }
                        }
                        calendar.set(1, parseInt);
                    }
                }
            }
        }
        return calendar.getTime();
    }

    public static void A04(Integer num, String str, TreeMap treeMap) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }
}
