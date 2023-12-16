package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.0YR  reason: invalid class name */
public class AnonymousClass0YR {
    public static final Map A00 = AnonymousClass001.A0t();
    public static final byte[] A01 = {80, 75, 3, 4};

    public static C05510Tu A01(Context context, String str, String str2) {
        try {
            if (str.endsWith(".zip") || str.endsWith(".lottie")) {
                return A04(str2, new ZipInputStream(context.getAssets().open(str)));
            }
            return A03(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new C05510Tu((Throwable) e);
        }
    }

    public static C05510Tu A02(C10470hz r23, String str, boolean z) {
        C05510Tu r1;
        C10470hz r5 = r23;
        try {
            float A002 = AnonymousClass0Y0.A00();
            C10550i7 r22 = new C10550i7();
            ArrayList A0s = AnonymousClass001.A0s();
            HashMap A0t = AnonymousClass001.A0t();
            HashMap A0t2 = AnonymousClass001.A0t();
            HashMap A0t3 = AnonymousClass001.A0t();
            ArrayList A0s2 = AnonymousClass001.A0s();
            C10530i5 r16 = new C10530i5();
            AnonymousClass0QL r4 = new AnonymousClass0QL();
            r5.A0H();
            int i = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i2 = 0;
            while (r5.A0N()) {
                switch (r5.A0A(C05240So.A03)) {
                    case 0:
                        i = r5.A09();
                        continue;
                    case 1:
                        i2 = r5.A09();
                        continue;
                    case 2:
                        f = C10470hz.A03(r5);
                        continue;
                    case 3:
                        f2 = C10470hz.A03(r5) - 0.01f;
                        continue;
                    case 4:
                        f3 = C10470hz.A03(r5);
                        continue;
                    case 5:
                        String[] split = r5.A0F().split("\\.");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        if (parseInt >= 4) {
                            if (parseInt <= 4) {
                                if (parseInt2 >= 4) {
                                    if (parseInt2 <= 4) {
                                        if (parseInt3 >= 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        AnonymousClass0QL.A01(r4, "Lottie only supports bodymovin >= 4.4.0");
                        break;
                    case 6:
                        r5.A0G();
                        int i3 = 0;
                        while (r5.A0N()) {
                            C04510Oo A003 = C05800Va.A00(r4, r5);
                            if (A003.A0E == C02190Ff.IMAGE) {
                                i3++;
                            }
                            A0s.add(A003);
                            r22.A0A(A003.A07, A003);
                            if (i3 > 4) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("You have ");
                                A0o.append(i3);
                                AnonymousClass0S3.A00(AnonymousClass000.A0X(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.", A0o));
                            }
                        }
                        break;
                    case 7:
                        r5.A0G();
                        while (r5.A0N()) {
                            ArrayList A0s3 = AnonymousClass001.A0s();
                            C10550i7 r13 = new C10550i7();
                            r5.A0H();
                            String str2 = null;
                            String str3 = null;
                            int i4 = 0;
                            int i5 = 0;
                            while (r5.A0N()) {
                                int A0A = r5.A0A(C05240So.A00);
                                if (A0A == 0) {
                                    str2 = r5.A0F();
                                } else if (A0A == 1) {
                                    r5.A0G();
                                    while (r5.A0N()) {
                                        C04510Oo A004 = C05800Va.A00(r4, r5);
                                        r13.A0A(A004.A07, A004);
                                        A0s3.add(A004);
                                    }
                                    r5.A0I();
                                } else if (A0A == 2) {
                                    i4 = r5.A09();
                                } else if (A0A == 3) {
                                    i5 = r5.A09();
                                } else if (A0A == 4) {
                                    str3 = r5.A0F();
                                } else if (A0A != 5) {
                                    r5.A0K();
                                    r5.A0L();
                                } else {
                                    r5.A0F();
                                }
                            }
                            r5.A0J();
                            if (str3 != null) {
                                AnonymousClass0MS r8 = new AnonymousClass0MS(str2, str3, i4, i5);
                                A0t2.put(r8.A04, r8);
                            } else {
                                A0t.put(str2, A0s3);
                            }
                        }
                        break;
                    case 8:
                        r5.A0H();
                        while (r5.A0N()) {
                            if (r5.A0A(C05240So.A01) != 0) {
                                r5.A0K();
                                r5.A0L();
                            } else {
                                r5.A0G();
                                while (r5.A0N()) {
                                    r5.A0H();
                                    String str4 = null;
                                    String str5 = null;
                                    String str6 = null;
                                    while (r5.A0N()) {
                                        int A0A2 = r5.A0A(AnonymousClass0SK.A00);
                                        if (A0A2 == 0) {
                                            str4 = r5.A0F();
                                        } else if (A0A2 == 1) {
                                            str5 = r5.A0F();
                                        } else if (A0A2 == 2) {
                                            str6 = r5.A0F();
                                        } else if (A0A2 != 3) {
                                            r5.A0K();
                                            r5.A0L();
                                        } else {
                                            r5.A08();
                                        }
                                    }
                                    r5.A0J();
                                    C03810Lq r82 = new C03810Lq(str4, str5, str6);
                                    A0t3.put(r82.A01, r82);
                                }
                                r5.A0I();
                            }
                        }
                        r5.A0J();
                        continue;
                    case 9:
                        r5.A0G();
                        while (r5.A0N()) {
                            ArrayList A0s4 = AnonymousClass001.A0s();
                            r5.A0H();
                            String str7 = null;
                            double d = 0.0d;
                            String str8 = null;
                            char c = 0;
                            while (r5.A0N()) {
                                int A0A3 = r5.A0A(AnonymousClass0Sd.A01);
                                if (A0A3 == 0) {
                                    c = r5.A0F().charAt(0);
                                } else if (A0A3 == 1) {
                                    r5.A08();
                                } else if (A0A3 == 2) {
                                    d = r5.A08();
                                } else if (A0A3 == 3) {
                                    str7 = r5.A0F();
                                } else if (A0A3 == 4) {
                                    str8 = r5.A0F();
                                } else if (A0A3 != 5) {
                                    r5.A0K();
                                    r5.A0L();
                                } else {
                                    r5.A0H();
                                    while (r5.A0N()) {
                                        if (r5.A0A(AnonymousClass0Sd.A00) != 0) {
                                            r5.A0K();
                                            r5.A0L();
                                        } else {
                                            r5.A0G();
                                            while (r5.A0N()) {
                                                A0s4.add(AnonymousClass0VO.A02(r4, r5));
                                            }
                                            r5.A0I();
                                        }
                                    }
                                    r5.A0J();
                                }
                            }
                            r5.A0J();
                            C04240Nj r83 = new C04240Nj(str7, str8, A0s4, c, d);
                            r16.A03(r83.hashCode(), r83);
                        }
                        break;
                    case 10:
                        r5.A0G();
                        while (r5.A0N()) {
                            r5.A0H();
                            float f4 = 0.0f;
                            String str9 = null;
                            float f5 = 0.0f;
                            while (r5.A0N()) {
                                int A0A4 = r5.A0A(C05240So.A02);
                                if (A0A4 == 0) {
                                    str9 = r5.A0F();
                                } else if (A0A4 == 1) {
                                    f4 = C10470hz.A03(r5);
                                } else if (A0A4 != 2) {
                                    r5.A0K();
                                    r5.A0L();
                                } else {
                                    f5 = C10470hz.A03(r5);
                                }
                            }
                            r5.A0J();
                            A0s2.add(new C03820Lr(str9, f4, f5));
                        }
                        break;
                    default:
                        r5.A0K();
                        r5.A0L();
                        continue;
                }
                r5.A0I();
            }
            r4.A04 = new Rect(0, 0, (int) (((float) i) * A002), (int) (((float) i2) * A002));
            r4.A02 = f;
            r4.A00 = f2;
            r4.A01 = f3;
            r4.A07 = A0s;
            r4.A05 = r22;
            r4.A0B = A0t;
            r4.A0A = A0t2;
            r4.A06 = r16;
            r4.A09 = A0t3;
            r4.A08 = A0s2;
            String str10 = str;
            if (str != null) {
                C05330Sx.A01.A00.A08(str10, r4);
            }
            r1 = new C05510Tu((Object) r4);
        } catch (Exception e) {
            r1 = new C05510Tu((Throwable) e);
        } catch (Throwable th) {
            if (z) {
                AnonymousClass0Y0.A04(r5);
            }
            throw th;
        }
        if (z) {
            AnonymousClass0Y0.A04(r5);
        }
        return r1;
    }

    public static AnonymousClass0UA A06(String str, Callable callable) {
        if (str != null) {
            Object A04 = C05330Sx.A01.A00.A04(str);
            if (A04 != null) {
                return new AnonymousClass0UA(new C17900wQ(A04, 3), false);
            }
            Map map = A00;
            if (map.containsKey(str)) {
                return (AnonymousClass0UA) map.get(str);
            }
        }
        AnonymousClass0UA r0 = new AnonymousClass0UA(callable, false);
        if (str == null) {
            return r0;
        }
        r0.A01(new C18200wu(str, 0));
        r0.A00(new C18200wu(str, 1));
        A00.put(str, r0);
        return r0;
    }

    public static final C188558z5 A08(C188078yH r1) {
        return new C173338Pf(r1);
    }

    public static C05510Tu A00(Context context, String str, int i) {
        try {
            C188558z5 A08 = A08(C1453975i.A00(context.getResources().openRawResource(i)));
            if (A07(A08).booleanValue()) {
                return A04(str, new ZipInputStream(A08.BGc()));
            }
            return A03(A08.BGc(), str);
        } catch (Resources.NotFoundException e) {
            return new C05510Tu((Throwable) e);
        }
    }

    public static C05510Tu A03(InputStream inputStream, String str) {
        try {
            return A02(C10470hz.A04(A08(C1453975i.A00(inputStream))), str, true);
        } finally {
            AnonymousClass0Y0.A04(inputStream);
        }
    }

    public static C05510Tu A04(String str, ZipInputStream zipInputStream) {
        try {
            return A05(str, zipInputStream);
        } finally {
            AnonymousClass0Y0.A04(zipInputStream);
        }
    }

    public static C05510Tu A05(String str, ZipInputStream zipInputStream) {
        Throwable A0I;
        HashMap A0t = AnonymousClass001.A0t();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            AnonymousClass0QL r3 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    r3 = (AnonymousClass0QL) A02(C10470hz.A04(A08(C1453975i.A00(zipInputStream))), (String) null, false).A00;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] split = name.split("/");
                    A0t.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (r3 == null) {
                A0I = AnonymousClass001.A0c("Unable to parse composition");
            } else {
                Iterator A0u = AnonymousClass001.A0u(A0t);
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    Object key = A0w.getKey();
                    Iterator A0v = AnonymousClass001.A0v(r3.A0A);
                    while (true) {
                        if (!A0v.hasNext()) {
                            break;
                        }
                        AnonymousClass0MS r5 = (AnonymousClass0MS) A0v.next();
                        if (r5.A03.equals(key)) {
                            Bitmap bitmap = (Bitmap) A0w.getValue();
                            int i = r5.A02;
                            int i2 = r5.A01;
                            if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                                bitmap.recycle();
                                bitmap = createScaledBitmap;
                            }
                            r5.A00 = bitmap;
                        }
                    }
                }
                Iterator A0q = AnonymousClass000.A0q(r3.A0A);
                while (A0q.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q);
                    if (((AnonymousClass0MS) A0w2.getValue()).A00 == null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("There is no image for ");
                        A0I = AnonymousClass000.A0I(((AnonymousClass0MS) A0w2.getValue()).A03, A0o);
                    }
                }
                if (str != null) {
                    C05330Sx.A01.A00.A08(str, r3);
                }
                return new C05510Tu((Object) r3);
            }
            return new C05510Tu(A0I);
        } catch (IOException e) {
            return new C05510Tu((Throwable) e);
        }
    }

    public static Boolean A07(C188558z5 r5) {
        try {
            C188558z5 Bga = r5.Bga();
            for (byte b : A01) {
                if (Bga.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            Bga.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
