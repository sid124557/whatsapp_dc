package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.7yt  reason: invalid class name and case insensitive filesystem */
public class C166557yt implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(112);
    public Object A00;
    public final C182518oY A01;
    public final Class A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C166557yt r5 = (C166557yt) obj;
            if (!this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || !AnonymousClass75J.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return C18310x6.A08(this.A00, objArr, 3);
    }

    public boolean A01() {
        boolean isEmpty;
        Object obj = this.A00;
        if (obj == null) {
            return true;
        }
        Class<String> cls = this.A02;
        if (cls == String.class) {
            isEmpty = ((String) obj).isEmpty();
        } else if (cls.isArray()) {
            if (Array.getLength(obj) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Collection) {
            isEmpty = ((Collection) obj).isEmpty();
        } else if (obj instanceof Map) {
            isEmpty = ((Map) obj).isEmpty();
        } else {
            throw AnonymousClass002.A0G("empty check not implemented for class type");
        }
        if (isEmpty) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String AxA = this.A01.AxA(this.A03, this.A00);
        if (AxA == null) {
            return "null";
        }
        return AxA;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A03);
        C182518oY r1 = this.A01;
        if (r1 instanceof AnonymousClass3QD) {
            i2 = 1;
        } else if (r1 instanceof AnonymousClass8HM) {
            i2 = 2;
        } else if (r1 instanceof AnonymousClass8HN) {
            parcel.writeInt(3);
            throw AnonymousClass001.A0g("getClass");
        } else {
            throw AnonymousClass0x9.A0i("[PrivacyPolicy] Unknown executor written to parcel");
        }
        parcel.writeInt(i2);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A00);
    }

    public C166557yt(C182518oY r2, Object obj, String str) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = obj.getClass();
        this.A00 = obj;
    }

    public static String A00(C166557yt r0) {
        C626936e.A06(r0);
        Object obj = r0.A00;
        C626936e.A06(obj);
        return (String) obj;
    }

    public C166557yt(C182518oY r1, Class cls, Object obj, String str) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = cls;
        this.A00 = obj;
    }

    public C166557yt(Parcel parcel) {
        C182518oY A002;
        this.A03 = C18310x6.A0l(parcel);
        int readInt = parcel.readInt();
        if (readInt == 1) {
            A002 = AnonymousClass3QD.A00();
        } else if (readInt == 2) {
            A002 = new AnonymousClass8HM();
        } else if (readInt == 3) {
            A002 = new AnonymousClass8HN(parcel);
        } else {
            throw AnonymousClass0x9.A0i("[PrivacyPolicy] Unknown executor read from parcel");
        }
        this.A01 = A002;
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        C626936e.A06(readValue);
        Class cls = (Class) readValue;
        this.A02 = cls;
        this.A00 = parcel.readValue(cls.getClassLoader());
    }
}
