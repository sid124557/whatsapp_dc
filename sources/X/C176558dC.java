package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.8dC  reason: invalid class name and case insensitive filesystem */
public class C176558dC extends AnonymousClass8Q0 {
    public static final Boolean A06 = new Boolean(false);
    public static final Boolean A07 = new Boolean(true);
    public static final Hashtable A08;
    public static final Hashtable A09;
    public static final Hashtable A0A;
    public static final Hashtable A0B;
    public static final Hashtable A0C;
    public static final Hashtable A0D;
    public static final C176768dX A0E;
    public static final C176768dX A0F;
    public static final C176768dX A0G;
    public static final C176768dX A0H;
    public static final C176768dX A0I;
    public static final C176768dX A0J;
    public static final C176768dX A0K;
    public static final C176768dX A0L = C176768dX.A0B("2.5.4.54");
    public static final C176768dX A0M;
    public static final C176768dX A0N;
    public static final C176768dX A0O;
    public static final C176768dX A0P;
    public static final C176768dX A0Q;
    public static final C176768dX A0R;
    public static final C176768dX A0S;
    public static final C176768dX A0T;
    public static final C176768dX A0U;
    public static final C176768dX A0V;
    public static final C176768dX A0W;
    public static final C176768dX A0X;
    public static final C176768dX A0Y;
    public static final C176768dX A0Z;
    public static final C176768dX A0a;
    public static final C176768dX A0b;
    public static final C176768dX A0c;
    public static final C176768dX A0d;
    public static final C176768dX A0e;
    public static final C176768dX A0f;
    public static final C176768dX A0g;
    public static final C176768dX A0h;
    public static final C176768dX A0i;
    public static final C176768dX A0j;
    public static final C176768dX A0k;
    public static final C176768dX A0l;
    public static final C176768dX A0m;
    public int A00;
    public Vector A01 = new Vector();
    public Vector A02 = new Vector();
    public Vector A03 = new Vector();
    public C176958dq A04;
    public boolean A05;

    static {
        C176768dX A0B2 = C176768dX.A0B("2.5.4.6");
        A0F = A0B2;
        C176768dX A0B3 = C176768dX.A0B("2.5.4.10");
        A0W = A0B3;
        C176768dX A0B4 = C176768dX.A0B("2.5.4.11");
        A0X = A0B4;
        C176768dX A0B5 = C176768dX.A0B("2.5.4.12");
        A0h = A0B5;
        C176768dX A0B6 = C176768dX.A0B("2.5.4.3");
        A0G = A0B6;
        C176768dX A0B7 = C176768dX.A0B("2.5.4.5");
        A0d = A0B7;
        C176768dX A0B8 = C176768dX.A0B("2.5.4.9");
        A0f = A0B8;
        A0c = A0B7;
        C176768dX A0B9 = C176768dX.A0B("2.5.4.7");
        A0T = A0B9;
        C176768dX A0B10 = C176768dX.A0B("2.5.4.8");
        A0e = A0B10;
        C176768dX A0B11 = C176768dX.A0B("2.5.4.4");
        A0g = A0B11;
        C176768dX A0B12 = C176768dX.A0B("2.5.4.42");
        A0R = A0B12;
        C176768dX A0B13 = C176768dX.A0B("2.5.4.43");
        A0S = A0B13;
        C176768dX A0B14 = C176768dX.A0B("2.5.4.44");
        A0Q = A0B14;
        C176768dX A0B15 = C176768dX.A0B("2.5.4.45");
        A0k = A0B15;
        C176768dX A0B16 = C176768dX.A0B("2.5.4.15");
        A0E = A0B16;
        C176768dX A0B17 = C176768dX.A0B("2.5.4.17");
        A0a = A0B17;
        C176768dX A0B18 = C176768dX.A0B("2.5.4.46");
        A0M = A0B18;
        C176768dX A0B19 = C176768dX.A0B("2.5.4.65");
        A0b = A0B19;
        C176768dX A0B20 = C176768dX.A0B("1.3.6.1.5.5.7.9.1");
        A0J = A0B20;
        C176768dX A0B21 = C176768dX.A0B("1.3.6.1.5.5.7.9.2");
        A0Y = A0B21;
        C176768dX A0B22 = C176768dX.A0B("1.3.6.1.5.5.7.9.3");
        A0P = A0B22;
        C176768dX A0B23 = C176768dX.A0B("1.3.6.1.5.5.7.9.4");
        A0H = A0B23;
        C176768dX A0B24 = C176768dX.A0B("1.3.6.1.5.5.7.9.5");
        A0I = A0B24;
        C176768dX A0B25 = C176768dX.A0B("1.3.36.8.3.14");
        A0V = A0B25;
        C176768dX A0B26 = C176768dX.A0B("2.5.4.16");
        A0Z = A0B26;
        C176768dX r29 = C186858w3.A09;
        A0i = r29;
        C176768dX r28 = C186858w3.A07;
        A0U = r28;
        C176768dX r4 = C186938wB.A1u;
        A0O = r4;
        C176768dX r27 = C186938wB.A24;
        A0m = r27;
        C176768dX r26 = C186938wB.A23;
        A0l = r26;
        A0N = r4;
        C176768dX A0B27 = C176768dX.A0B("0.9.2342.19200300.100.1.25");
        A0K = A0B27;
        C176768dX A0B28 = C176768dX.A0B("0.9.2342.19200300.100.1.1");
        A0j = A0B28;
        Hashtable hashtable = new Hashtable();
        A09 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        A0C = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        A0B = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        A08 = hashtable4;
        A0A = hashtable;
        A0D = hashtable4;
        hashtable.put(A0B2, "C");
        hashtable.put(A0B3, "O");
        hashtable.put(A0B5, "T");
        hashtable.put(A0B4, "OU");
        hashtable.put(A0B6, "CN");
        hashtable.put(A0B9, "L");
        hashtable.put(A0B10, "ST");
        hashtable.put(A0B7, "SERIALNUMBER");
        hashtable.put(r4, "E");
        hashtable.put(A0B27, "DC");
        hashtable.put(A0B28, "UID");
        hashtable.put(A0B8, "STREET");
        hashtable.put(A0B11, "SURNAME");
        hashtable.put(A0B12, "GIVENNAME");
        hashtable.put(A0B13, "INITIALS");
        hashtable.put(A0B14, "GENERATION");
        hashtable.put(r26, "unstructuredAddress");
        hashtable.put(r27, "unstructuredName");
        hashtable.put(A0B15, "UniqueIdentifier");
        hashtable.put(A0B18, "DN");
        hashtable.put(A0B19, "Pseudonym");
        hashtable.put(A0B26, "PostalAddress");
        hashtable.put(A0B25, "NameAtBirth");
        hashtable.put(A0B23, "CountryOfCitizenship");
        hashtable.put(A0B24, "CountryOfResidence");
        hashtable.put(A0B22, "Gender");
        hashtable.put(A0B21, "PlaceOfBirth");
        hashtable.put(A0B20, "DateOfBirth");
        hashtable.put(A0B17, "PostalCode");
        hashtable.put(A0B16, "BusinessCategory");
        hashtable.put(r29, "TelephoneNumber");
        hashtable.put(r28, "Name");
        hashtable2.put(A0B2, "C");
        hashtable2.put(A0B3, "O");
        hashtable2.put(A0B4, "OU");
        hashtable2.put(A0B6, "CN");
        hashtable2.put(A0B9, "L");
        hashtable2.put(A0B10, "ST");
        hashtable2.put(A0B8, "STREET");
        hashtable2.put(A0B27, "DC");
        hashtable2.put(A0B28, "UID");
        hashtable3.put(A0B2, "C");
        hashtable3.put(A0B3, "O");
        hashtable3.put(A0B4, "OU");
        hashtable3.put(A0B6, "CN");
        hashtable3.put(A0B9, "L");
        hashtable3.put(A0B10, "ST");
        hashtable3.put(A0B8, "STREET");
        hashtable4.put("c", A0B2);
        hashtable4.put("o", A0B3);
        hashtable4.put("t", A0B5);
        hashtable4.put("ou", A0B4);
        hashtable4.put("cn", A0B6);
        hashtable4.put("l", A0B9);
        hashtable4.put("st", A0B10);
        hashtable4.put("sn", A0B7);
        hashtable4.put("serialnumber", A0B7);
        hashtable4.put("street", A0B8);
        hashtable4.put("emailaddress", r4);
        hashtable4.put("dc", A0B27);
        hashtable4.put("e", r4);
        hashtable4.put("uid", A0B28);
        hashtable4.put("surname", A0B11);
        hashtable4.put("givenname", A0B12);
        hashtable4.put("initials", A0B13);
        hashtable4.put("generation", A0B14);
        hashtable4.put("unstructuredaddress", r26);
        hashtable4.put("unstructuredname", r27);
        hashtable4.put("uniqueidentifier", A0B15);
        hashtable4.put("dn", A0B18);
        hashtable4.put("pseudonym", A0B19);
        hashtable4.put("postaladdress", A0B26);
        hashtable4.put("nameofbirth", A0B25);
        hashtable4.put("countryofcitizenship", A0B23);
        hashtable4.put("countryofresidence", A0B24);
        hashtable4.put("gender", A0B22);
        hashtable4.put("placeofbirth", A0B21);
        hashtable4.put("dateofbirth", A0B20);
        hashtable4.put("postalcode", A0B17);
        hashtable4.put("businesscategory", A0B16);
        hashtable4.put("telephonenumber", r29);
        hashtable4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r28);
    }

    public boolean equals(Object obj) {
        C176558dC r13;
        Object obj2 = obj;
        if (obj2 != this) {
            boolean z = obj2 instanceof C176558dC;
            if (z || (obj2 instanceof C176958dq)) {
                if (!Bqk().A0T(((C183618qL) obj2).Bqk())) {
                    if (z) {
                        try {
                            r13 = (C176558dC) obj2;
                        } catch (IllegalArgumentException unused) {
                            return false;
                        }
                    } else {
                        if (obj2 instanceof C176618dI) {
                            obj2 = ((C176618dI) obj2).A01;
                        } else if (obj == null) {
                            r13 = null;
                        }
                        r13 = new C176558dC(C176958dq.A0C(obj2));
                    }
                    Vector vector = this.A02;
                    int size = vector.size();
                    Vector vector2 = r13.A02;
                    if (size == vector2.size()) {
                        boolean[] zArr = new boolean[size];
                        int i = size - 1;
                        int i2 = -1;
                        int i3 = -1;
                        if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                            i2 = size;
                            i = 0;
                            i3 = 1;
                        }
                        while (i != i2) {
                            C177088e3 r4 = (C177088e3) vector.elementAt(i);
                            String str = (String) this.A03.elementAt(i);
                            for (int i4 = 0; i4 < size; i4++) {
                                if (!zArr[i4] && r4.A0T((C177088e3) vector2.elementAt(i4))) {
                                    String A0N2 = A0N(str);
                                    String A0N3 = A0N((String) r13.A03.elementAt(i4));
                                    if (A0N2.equals(A0N3) || A0A(A0N2).equals(A0A(A0N3))) {
                                        zArr[i4] = true;
                                        i += i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (!this.A05) {
            this.A05 = true;
            int i = 0;
            while (true) {
                Vector vector = this.A02;
                if (i == vector.size()) {
                    break;
                }
                String A0A2 = A0A(A0N((String) this.A03.elementAt(i)));
                int A052 = AnonymousClass6CA.A05(vector.elementAt(i), this.A00);
                this.A00 = A052;
                this.A00 = A0A2.hashCode() ^ A052;
                i++;
            }
        }
        return this.A00;
    }

    public String toString() {
        Hashtable hashtable = A09;
        StringBuffer A0X2 = AnonymousClass6CA.A0X();
        Vector vector = new Vector();
        StringBuffer stringBuffer = null;
        int i = 0;
        while (true) {
            Vector vector2 = this.A02;
            if (i >= vector2.size()) {
                break;
            }
            if (AnonymousClass001.A1Z(this.A01.elementAt(i))) {
                stringBuffer.append('+');
                A0B((String) this.A03.elementAt(i), stringBuffer, hashtable, (C176768dX) vector2.elementAt(i));
            } else {
                stringBuffer = AnonymousClass6CA.A0X();
                A0B((String) this.A03.elementAt(i), stringBuffer, hashtable, (C176768dX) vector2.elementAt(i));
                vector.addElement(stringBuffer);
            }
            i++;
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                A0X2.append(',');
            }
            A0X2.append(vector.elementAt(i2).toString());
        }
        return A0X2.toString();
    }

    public C176558dC(C176958dq r12) {
        Boolean bool;
        Vector vector;
        this.A04 = r12;
        Enumeration A0V2 = r12.A0V();
        while (A0V2.hasMoreElements()) {
            C176998du A0A2 = C176998du.A0A(((C183618qL) A0V2.nextElement()).Bqk());
            int i = 0;
            while (true) {
                C183618qL[] r1 = A0A2.A01;
                if (i < r1.length) {
                    C176958dq A0C2 = C176958dq.A0C(r1[i].Bqk());
                    if (A0C2.A0U() == 2) {
                        this.A02.addElement(C176768dX.A0A(A0C2.A0W(0)));
                        C183618qL A0B2 = C176958dq.A0B(A0C2);
                        if (!(A0B2 instanceof C183628qM) || (A0B2 instanceof C176878di)) {
                            try {
                                Vector vector2 = this.A03;
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("#");
                                byte[] A092 = AnonymousClass8Q0.A09(A0B2);
                                byte[] A022 = AnonymousClass35E.A02(A092, 0, A092.length);
                                int length = A022.length;
                                char[] cArr = new char[length];
                                for (int i2 = 0; i2 != length; i2++) {
                                    cArr[i2] = (char) (A022[i2] & 255);
                                }
                                vector2.addElement(AnonymousClass000.A0X(new String(cArr), A0o));
                            } catch (IOException unused) {
                                throw AnonymousClass001.A0c("cannot encode value");
                            }
                        } else {
                            String BDM = ((C183628qM) A0B2).BDM();
                            if (BDM.length() <= 0 || BDM.charAt(0) != '#') {
                                vector = this.A03;
                            } else {
                                vector = this.A03;
                                BDM = AnonymousClass000.A0V("\\", BDM, AnonymousClass001.A0o());
                            }
                            vector.addElement(BDM);
                        }
                        Vector vector3 = this.A01;
                        if (i != 0) {
                            bool = A07;
                        } else {
                            bool = A06;
                        }
                        vector3.addElement(bool);
                        i++;
                    } else {
                        throw AnonymousClass001.A0c("badly sized pair");
                    }
                }
            }
        }
    }

    public static final String A0A(String str) {
        StringBuffer A0X2 = AnonymousClass6CA.A0X();
        int length = str.length();
        if (length != 0) {
            char A002 = AnonymousClass6C9.A00(str);
            A0X2.append(A002);
            int i = 1;
            while (i < length) {
                char charAt = str.charAt(i);
                if (A002 != ' ' || charAt != ' ') {
                    A0X2.append(charAt);
                }
                i++;
                A002 = charAt;
            }
        }
        return A0X2.toString();
    }

    public static final void A0B(String str, StringBuffer stringBuffer, Hashtable hashtable, C176768dX r9) {
        int i;
        String str2 = (String) hashtable.get(r9);
        if (str2 == null) {
            str2 = r9.A01;
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && AnonymousClass6C9.A00(str) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i < length2 && stringBuffer.charAt(i) == ' ') {
            stringBuffer.insert(i, "\\");
            length = i + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (i <= length2) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length2++;
        }
    }

    public final String A0N(String str) {
        String A002 = C162077rB.A00(str.trim());
        int length = A002.length();
        if (length <= 0 || AnonymousClass6C9.A00(A002) != '#') {
            return A002;
        }
        try {
            C177088e3 A0I2 = C177088e3.A0I(AnonymousClass35E.A01(A002, length - 1));
            if (A0I2 instanceof C183628qM) {
                return C162077rB.A00(((C183628qM) A0I2).BDM().trim());
            }
            return A002;
        } catch (IOException e) {
            throw AnonymousClass000.A0H(e, "unknown encoding in name: ", AnonymousClass001.A0o());
        }
    }

    public C176558dC() {
    }
}
