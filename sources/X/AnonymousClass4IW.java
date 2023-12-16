package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipant;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4IW  reason: invalid class name */
public class AnonymousClass4IW implements Parcelable.Creator {
    public final int A00;

    public AnonymousClass4IW(int i) {
        this.A00 = i;
    }

    public static AnonymousClass4IW A00(int i) {
        return new AnonymousClass4IW(i);
    }

    public static /* bridge */ /* synthetic */ Object A01(Parcel parcel) {
        C624034w r13;
        Parcel parcel2 = parcel;
        int readInt = parcel2.readInt();
        int readInt2 = parcel2.readInt();
        long readLong = parcel2.readLong();
        String readString = parcel2.readString();
        int readInt3 = parcel2.readInt();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        AnonymousClass32Y r2 = UserJid.Companion;
        UserJid A0E = r2.A0E(readString4);
        UserJid A0E2 = r2.A0E(parcel2.readString());
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        String readString8 = parcel2.readString();
        ArrayList readArrayList = parcel2.readArrayList(AnonymousClass38Z.class.getClassLoader());
        UserJid A0E3 = r2.A0E(parcel2.readString());
        boolean A1S = AnonymousClass000.A1S(parcel2.readInt());
        long readLong2 = parcel2.readLong();
        String readString9 = parcel2.readString();
        String readString10 = parcel2.readString();
        int readInt4 = parcel2.readInt();
        boolean A1U = AnonymousClass000.A1U(parcel2.readInt(), 1);
        AnonymousClass39R r22 = (AnonymousClass39R) C18280x3.A0C(parcel2, AnonymousClass39R.class);
        int readInt5 = parcel2.readInt();
        int readInt6 = parcel2.readInt();
        byte[] bArr = new byte[readInt6];
        if (readInt6 > 0) {
            parcel2.readByteArray(bArr);
        }
        int readInt7 = parcel2.readInt();
        AnonymousClass1S4 r1 = (AnonymousClass1S4) C18280x3.A0C(parcel2, AnonymousClass1S4.class);
        C85204Fi A002 = C617332a.A00(parcel2);
        if (readInt == 5) {
            r13 = new C624034w(readString10, 5, readInt4, 0, readLong2);
            r13.A0R = bArr;
            r13.A0L = readString5;
            r13.A0C = A0E3;
            r13.A0Q = A1S;
            r13.A0P = A1U;
            r13.A07 = A002;
        } else {
            AnonymousClass39Q A003 = AnonymousClass39Q.A00(readString2, readInt3);
            if (readInt != 4) {
                r13 = new C624034w(A002, A003, A0E, A0E2, readString, readString3, readString6, readString7, readString8, (String) null, readString10, readInt, readInt2, readInt4, readInt7, readInt5, readLong2, readLong);
                r13.A0L = readString5;
                if (readArrayList != null) {
                    ArrayList A0y = C18290x4.A0y(readArrayList);
                    Iterator it = readArrayList.iterator();
                    while (it.hasNext()) {
                        A0y.add(((AnonymousClass38Z) it.next()).A00);
                    }
                    r13.A0N = A0y;
                }
                r13.A0C = A0E3;
                r13.A0Q = A1S;
                r13.A0A = r1;
                r13.A07 = A002;
            } else {
                r13 = AnonymousClass36S.A00(readLong2);
            }
            r13.A0M = readString9;
            r13.A0P = A1U;
            r13.A0C(r22);
        }
        return new AnonymousClass38V(r13);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass39Q(parcel);
            case 1:
                return new AnonymousClass1S3(parcel);
            case 2:
                return new AnonymousClass39O(parcel);
            case 3:
                return new AnonymousClass39L(parcel);
            case 4:
                return new AnonymousClass39U(parcel);
            case 5:
                return A01(parcel);
            case 6:
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C166587yw A05 = C166587yw.A05(C161357pU.A00(readString2), readString, parcel.readString(), parcel.readString(), readInt);
                if (A05 instanceof C133736hr) {
                    ((C133736hr) A05).A01 = parcel.readInt();
                }
                AnonymousClass39Q A002 = AnonymousClass39Q.A00(parcel.readString(), parcel.readInt());
                int readInt2 = parcel.readInt();
                if (A002 == null) {
                    return null;
                }
                return new AnonymousClass38Z(new C42392Nx(A002, A05, readInt2));
            case 7:
                return new AnonymousClass39R(parcel);
            case 8:
                return new C30661mo(parcel);
            case 9:
                return new AnonymousClass39S(parcel);
            case 10:
                return new AnonymousClass393(parcel);
            case 11:
                return new AnonymousClass399(parcel);
            case 12:
                return new AnonymousClass39H(parcel);
            case 13:
                return new AnonymousClass390(parcel);
            case 14:
                return new AnonymousClass39F(parcel);
            case 15:
                return new AnonymousClass39G(parcel);
            case 16:
                return new AnonymousClass394(parcel);
            case 17:
                return new AnonymousClass3SO(parcel);
            case 18:
                return new AnonymousClass3SP(parcel);
            case 19:
                return new AnonymousClass3SR(parcel);
            case 20:
                return new AnonymousClass3SQ(parcel);
            case 21:
                return new AnonymousClass39W(parcel);
            case 22:
                return new AnonymousClass39A(parcel);
            case 23:
                return A02(parcel);
            case 24:
                return new AnonymousClass39P(parcel);
            case 25:
                return new AnonymousClass391(parcel);
            case 26:
                return new AnonymousClass395(parcel);
            case 27:
                return new AnonymousClass39E(parcel);
            case 28:
                return new AnonymousClass392(parcel);
            case 29:
                return new AnonymousClass39B(parcel);
            case 30:
                return new AnonymousClass396(parcel);
            case 31:
                return new AnonymousClass39N(parcel);
            case 32:
                return new AnonymousClass397(parcel);
            case 33:
                return new AnonymousClass398(parcel);
            case 34:
                return new AnonymousClass39T(parcel);
            case 35:
                return new AnonymousClass39J(parcel);
            case 36:
                return new CallParticipant(parcel);
            default:
                return new AnonymousClass39C(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass39Q[i];
            case 1:
                return new AnonymousClass1S3[i];
            case 2:
                return new AnonymousClass39O[i];
            case 3:
                return new AnonymousClass39L[i];
            case 4:
                return new AnonymousClass39U[i];
            case 5:
                return new AnonymousClass38V[i];
            case 6:
                return new AnonymousClass38Z[i];
            case 7:
                return new AnonymousClass39R[i];
            case 8:
                return new C30661mo[i];
            case 9:
                return new AnonymousClass39S[i];
            case 10:
                return new AnonymousClass393[i];
            case 11:
                return new AnonymousClass399[i];
            case 12:
                return new AnonymousClass39H[i];
            case 13:
                return new AnonymousClass390[i];
            case 14:
                return new AnonymousClass39F[i];
            case 15:
                return new AnonymousClass39G[i];
            case 16:
                return new AnonymousClass394[i];
            case 17:
                return new AnonymousClass3SO[i];
            case 18:
                return new AnonymousClass3SP[i];
            case 19:
                return new AnonymousClass3SR[i];
            case 20:
                return new AnonymousClass3SQ[i];
            case 21:
                return new AnonymousClass39W[i];
            case 22:
                return new AnonymousClass39A[i];
            case 23:
                return new C165797xe[i];
            case 24:
                return new AnonymousClass39P[i];
            case 25:
                return new AnonymousClass391[i];
            case 26:
                return new AnonymousClass395[i];
            case 27:
                return new AnonymousClass39E[i];
            case 28:
                return new AnonymousClass392[i];
            case 29:
                return new AnonymousClass39B[i];
            case 30:
                return new AnonymousClass396[i];
            case 31:
                return new AnonymousClass39N[i];
            case 32:
                return new AnonymousClass397[i];
            case 33:
                return new AnonymousClass398[i];
            case 34:
                return new AnonymousClass39T[i];
            case 35:
                return new AnonymousClass39J[i];
            case 36:
                return new CallParticipant[i];
            default:
                return new AnonymousClass39C[i];
        }
    }

    public C165797xe A02(Parcel parcel) {
        return A02(parcel);
    }
}
