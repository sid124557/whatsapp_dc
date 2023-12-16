package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5QS  reason: invalid class name */
public class AnonymousClass5QS {
    public int A00 = 0;
    public String A01;
    public List A02 = AnonymousClass001.A0s();
    public AnonymousClass5T6 A03;
    public C149097La A04;

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 == null || str2.equalsIgnoreCase(CredentialProviderBaseController.TYPE_TAG)) {
            this.A03.A04.add(str);
        } else {
            this.A03.A00.put(str2, str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        AnonymousClass5T6 r6;
        String str;
        byte[] bArr;
        byte[] bArr2;
        C143746zP r1;
        if (list == null || list.size() == 0) {
            AnonymousClass5T6 r12 = this.A03;
            r12.A06 = null;
            r12.A03.clear();
            str = "";
            this.A03.A03.add(str);
            r6 = this.A03;
        } else {
            String asString = this.A03.A00.getAsString("ENCODING");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                AnonymousClass5T6 r13 = this.A03;
                List list2 = r13.A03;
                if (asString != null) {
                    int i = 0;
                    if (asString.equals("BASE64") || asString.equals("B")) {
                        r13.A06 = Base64.decode(A0m.getBytes(), 0);
                        list2.add(A0m);
                    } else if (asString.equals("QUOTED-PRINTABLE")) {
                        String replaceAll = A0m.replaceAll("= ", " ").replaceAll("=\t", "\t");
                        StringBuilder A0o = AnonymousClass001.A0o();
                        int length = replaceAll.length();
                        ArrayList A0s = AnonymousClass001.A0s();
                        int i2 = 0;
                        while (i2 < length) {
                            char charAt = replaceAll.charAt(i2);
                            if (charAt == 10) {
                                AnonymousClass0x7.A1D(A0o, A0s);
                                A0o = AnonymousClass001.A0o();
                            } else if (charAt == 13) {
                                AnonymousClass0x7.A1D(A0o, A0s);
                                A0o = AnonymousClass001.A0o();
                                if (i2 < length - 1) {
                                    int i3 = i2 + 1;
                                    if (replaceAll.charAt(i3) == 10) {
                                        i2 = i3;
                                    }
                                }
                            } else {
                                A0o.append(charAt);
                            }
                            i2++;
                        }
                        String obj = A0o.toString();
                        if (obj.length() > 0) {
                            A0s.add(obj);
                        }
                        String[] A1b = C18300x5.A1b(A0s);
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        for (String str2 : A1b) {
                            if (str2.endsWith("=")) {
                                str2 = str2.substring(0, str2.length() - 1);
                            }
                            A0o2.append(str2);
                        }
                        try {
                            bArr2 = A0o2.toString().getBytes(DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e) {
                            C18260x0.A0u("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass001.A0o(), e);
                            bArr2 = A0o2.toString().getBytes();
                        }
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                while (i < bArr2.length) {
                                    byte b = bArr2[i];
                                    if (b == 61) {
                                        int i4 = i + 1;
                                        byte b2 = bArr2[i4];
                                        int digit = Character.digit((char) b2, 16);
                                        if (digit != -1) {
                                            i = i4 + 1;
                                            byte b3 = bArr2[i];
                                            int digit2 = Character.digit((char) b3, 16);
                                            if (digit2 != -1) {
                                                byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                                            } else {
                                                r1 = new C143746zP(AnonymousClass000.A0Y("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass001.A0o(), b3));
                                            }
                                        } else {
                                            r1 = new C143746zP(AnonymousClass000.A0Y("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass001.A0o(), b2));
                                        }
                                        throw r1;
                                    }
                                    byteArrayOutputStream.write(b);
                                    i++;
                                }
                                bArr = byteArrayOutputStream.toByteArray();
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                throw new C143746zP((Throwable) e2);
                            } catch (C143746zP e3) {
                                Log.e("Failed to decode quoted-printable: ", e3);
                                A0m = "";
                            }
                        }
                        try {
                            A0m = new String(bArr, DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e4) {
                            C18260x0.A0u("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass001.A0o(), e4);
                            A0m = new String(bArr);
                        }
                        list2.add(A0m);
                    }
                }
                if (!DefaultCrypto.UTF_8.equalsIgnoreCase(DefaultCrypto.UTF_8)) {
                    ByteBuffer encode = Charset.forName(DefaultCrypto.UTF_8).encode(A0m);
                    bArr = new byte[encode.remaining()];
                    encode.get(bArr);
                    A0m = new String(bArr, DefaultCrypto.UTF_8);
                }
                list2.add(A0m);
            }
            r6 = this.A03;
            List list3 = r6.A03;
            int size = list3.size();
            if (size > 1) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    A0o3.append(AnonymousClass001.A0m(it2));
                    A0o3.append(";");
                }
                int length2 = A0o3.length();
                if (length2 > 0) {
                    int i5 = length2 - 1;
                    if (A0o3.charAt(i5) == ';') {
                        str = A0o3.substring(0, i5);
                    }
                }
                str = A0o3.toString();
            } else if (size == 1) {
                str = AnonymousClass001.A0n(list3, 0);
            } else {
                str = "";
            }
        }
        r6.A02 = str;
    }
}
