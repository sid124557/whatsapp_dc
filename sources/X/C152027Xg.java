package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* renamed from: X.7Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C152027Xg {
    public final Object A00 = AnonymousClass002.A0D();

    public SparseArray A00(AnonymousClass7GN r20) {
        C127796Ti[] r0;
        AnonymousClass7OU[] r9;
        AnonymousClass7BX[] r13;
        AnonymousClass7BW[] r11;
        int i;
        AnonymousClass7GN r6 = r20;
        if (this instanceof AnonymousClass6YX) {
            AnonymousClass6YX r4 = (AnonymousClass6YX) this;
            ByteBuffer byteBuffer = r6.A00;
            synchronized (r4.A03) {
                if (r4.A00) {
                    AnonymousClass6YK r5 = r4.A01;
                    C162177rO.A02(byteBuffer);
                    C127846Tn r2 = new C127846Tn();
                    C149647Nh r1 = r6.A01;
                    r2.A00 = r1.A00;
                    r2.A01 = r1.A01;
                    r2.A03 = r1.A03;
                    r2.A02 = r1.A02;
                    r2.A04 = r1.A04;
                    if (!AnonymousClass000.A1W(r5.A00())) {
                        r9 = new AnonymousClass7OU[0];
                    } else {
                        try {
                            AnonymousClass6UT r02 = new AnonymousClass6UT(byteBuffer);
                            Object A002 = r5.A00();
                            C162177rO.A02(A002);
                            AnonymousClass6XO r12 = (AnonymousClass6XO) ((C187208wl) A002);
                            Parcel A003 = AnonymousClass6DX.A00(r02, r12);
                            AnonymousClass001.A15(A003, r2, 0);
                            Parcel A004 = r12.A00(A003);
                            AnonymousClass6SV[] r8 = (AnonymousClass6SV[]) A004.createTypedArray(AnonymousClass6SV.CREATOR);
                            A004.recycle();
                            int length = r8.length;
                            r9 = new AnonymousClass7OU[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                AnonymousClass6SV r112 = r8[i2];
                                int i3 = r112.A0B;
                                PointF pointF = new PointF(r112.A00, r112.A01);
                                float f = r112.A02;
                                float f2 = r112.A03;
                                AnonymousClass6SO[] r14 = r112.A0D;
                                if (r14 == null) {
                                    r13 = new AnonymousClass7BX[0];
                                } else {
                                    int length2 = r14.length;
                                    r13 = new AnonymousClass7BX[length2];
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        AnonymousClass6SO r03 = r14[i4];
                                        r13[i4] = new AnonymousClass7BX(new PointF(r03.A00, r03.A01));
                                    }
                                }
                                C127366Rr[] r142 = r112.A0E;
                                if (r142 == null) {
                                    r11 = new AnonymousClass7BW[0];
                                } else {
                                    int length3 = r142.length;
                                    r11 = new AnonymousClass7BW[length3];
                                    for (int i5 = 0; i5 < length3; i5++) {
                                        r11[i5] = new AnonymousClass7BW(r142[i5].A01);
                                    }
                                }
                                r9[i2] = new AnonymousClass7OU(pointF, r11, r13, f, f2, i3);
                            }
                        } catch (RemoteException e) {
                            Log.e("FaceNativeHandle", "Could not call native face detector", e);
                            r9 = new AnonymousClass7OU[0];
                        }
                    }
                } else {
                    throw AnonymousClass001.A0e("Cannot use detector after release()");
                }
            }
            HashSet A0K = AnonymousClass002.A0K();
            SparseArray sparseArray = new SparseArray(r12);
            int i6 = 0;
            for (AnonymousClass7OU r7 : r9) {
                int i7 = r7.A02;
                i6 = Math.max(i6, i7);
                if (A0K.contains(Integer.valueOf(i7))) {
                    i7 = i6 + 1;
                    i6 = i7;
                }
                C18270x1.A1K(A0K, i7);
                C156277gM r52 = r4.A02;
                synchronized (C156277gM.A03) {
                    SparseIntArray sparseIntArray = r52.A00;
                    i = sparseIntArray.get(i7, -1);
                    if (i == -1) {
                        i = C156277gM.A02;
                        C156277gM.A02 = i + 1;
                        sparseIntArray.append(i7, i);
                        r52.A01.append(i, i7);
                    }
                }
                sparseArray.append(i, r7);
            }
            return sparseArray;
        }
        C127846Tn r3 = new C127846Tn();
        C149647Nh r15 = r6.A01;
        r3.A00 = r15.A00;
        r3.A01 = r15.A01;
        r3.A03 = r15.A03;
        r3.A02 = r15.A02;
        r3.A04 = r15.A04;
        ByteBuffer byteBuffer2 = r6.A00;
        AnonymousClass6YJ r16 = ((AnonymousClass6YW) this).A00;
        C162177rO.A02(byteBuffer2);
        if (!AnonymousClass000.A1W(r16.A00())) {
            r0 = new C127796Ti[0];
        } else {
            try {
                AnonymousClass6UT r04 = new AnonymousClass6UT(byteBuffer2);
                Object A005 = r16.A00();
                C162177rO.A02(A005);
                C163167tN r17 = (C163167tN) ((C187158wb) A005);
                Parcel A006 = AnonymousClass6DX.A00(r04, r17);
                AnonymousClass001.A15(A006, r3, 0);
                Parcel A007 = r17.A00(A006);
                r0 = (C127796Ti[]) A007.createTypedArray(C127796Ti.CREATOR);
                A007.recycle();
            } catch (RemoteException e2) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                r0 = new C127796Ti[0];
            }
        }
        SparseArray sparseArray2 = new SparseArray(r4);
        for (C127796Ti r22 : r0) {
            sparseArray2.append(r22.A0C.hashCode(), r22);
        }
        return sparseArray2;
    }

    public void A01() {
        synchronized (this.A00) {
        }
    }

    public boolean A02() {
        if (this instanceof AnonymousClass6YX) {
            return AnonymousClass000.A1W(((AnonymousClass6YX) this).A01.A00());
        }
        return AnonymousClass000.A1W(((AnonymousClass6YW) this).A00.A00());
    }
}
