package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.7s6  reason: invalid class name and case insensitive filesystem */
public class C162447s6 {
    public static float A01(Parcel parcel, int i) {
        A0K(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int A03(Parcel parcel, int i) {
        A0K(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A05(Parcel parcel, int i, int i2, int i3) {
        if (i != 4) {
            A0I(parcel, i2);
            return i3;
        }
        A0K(parcel, i2, 4);
        return parcel.readInt();
    }

    public static double A00(Parcel parcel, int i) {
        A0K(parcel, i, 8);
        return parcel.readDouble();
    }

    public static int A04(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static int A06(Parcel parcel, int i, int i2, int i3, int i4) {
        if (i != i2) {
            A0I(parcel, i3);
            return i4;
        }
        A0K(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long A07(Parcel parcel, int i) {
        A0K(parcel, i, 8);
        return parcel.readLong();
    }

    public static LatLng A0B(Parcel parcel, int i) {
        return (LatLng) A0A(parcel, LatLng.CREATOR, i);
    }

    public static String A0E(Parcel parcel, String str, int i, int i2, int i3) {
        if (i == i2) {
            return A0D(parcel, i3);
        }
        A0I(parcel, i3);
        return str;
    }

    public static void A0J(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Expected size ");
            A0o.append(i2);
            A0o.append(" got ");
            A0o.append(i);
            A0o.append(" (0x");
            A0o.append(hexString);
            throw new AnonymousClass8RI(parcel, AnonymousClass000.A0e(A0o));
        }
    }

    public static boolean A0M(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return A0L(parcel, i3);
        }
        A0I(parcel, i3);
        return z;
    }

    public static byte[] A0P(Parcel parcel, byte[] bArr, int i, int i2, int i3) {
        if (i == i2) {
            return A0O(parcel, i3);
        }
        A0I(parcel, i3);
        return bArr;
    }

    public static int A02(Parcel parcel) {
        int readInt = parcel.readInt();
        int A04 = A04(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int i = A04 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Size read is invalid start=");
            A0o.append(dataPosition);
            throw new AnonymousClass8RI(parcel, AnonymousClass000.A0Y(" end=", A0o, i));
        }
        throw new AnonymousClass8RI(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static Bundle A08(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A04);
        return readBundle;
    }

    public static IBinder A09(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A04);
        return readStrongBinder;
    }

    public static Parcelable A0A(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A04);
        return parcelable;
    }

    public static Float A0C(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        if (A04 == 0) {
            return null;
        }
        A0J(parcel, A04, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static String A0D(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A04);
        return readString;
    }

    public static ArrayList A0F(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A04);
        return createStringArrayList;
    }

    public static ArrayList A0G(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArrayList;
    }

    public static void A0H(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new AnonymousClass8RI(parcel, AnonymousClass000.A0Y("Overread allowed size end=", AnonymousClass001.A0o(), i));
        }
    }

    public static void A0I(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A04(parcel, i));
    }

    public static void A0K(Parcel parcel, int i, int i2) {
        int A04 = A04(parcel, i);
        if (A04 != i2) {
            String hexString = Integer.toHexString(A04);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Expected size ");
            A0o.append(i2);
            A0o.append(" got ");
            A0o.append(A04);
            A0o.append(" (0x");
            A0o.append(hexString);
            throw new AnonymousClass8RI(parcel, AnonymousClass000.A0e(A0o));
        }
    }

    public static boolean A0L(Parcel parcel, int i) {
        return AnonymousClass000.A1S(A03(parcel, i));
    }

    public static boolean A0N(Parcel parcel, boolean z) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 1) {
            return A0L(parcel, readInt);
        }
        A0I(parcel, readInt);
        return z;
    }

    public static byte[] A0O(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A04);
        return createByteArray;
    }

    public static int[] A0Q(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A04);
        return createIntArray;
    }

    public static Object[] A0R(Parcel parcel, Parcelable.Creator creator, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArray;
    }

    public static String[] A0S(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A04);
        return createStringArray;
    }

    public static byte[][] A0T(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A04);
        return bArr;
    }
}
