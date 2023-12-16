package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.35z  reason: invalid class name and case insensitive filesystem */
public class C626635z {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.AnonymousClass1ED r4) {
        /*
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = X.C18270x1.A1T(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x002c
            int r1 = r4.gifAttribution_
            if (r1 == 0) goto L_0x0030
            r0 = 1
            if (r1 == r0) goto L_0x002d
            r0 = 2
            if (r1 != r0) goto L_0x0030
            X.22n r2 = X.C374122n.TENOR
        L_0x0017:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0033
            r0 = 2
            if (r1 == r0) goto L_0x0033
            if (r1 == r3) goto L_0x002c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageUtil/getGifAttribution/error: Unexpected gif attribution="
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x002c:
            return r3
        L_0x002d:
            X.22n r2 = X.C374122n.GIPHY
            goto L_0x0017
        L_0x0030:
            X.22n r2 = X.C374122n.NONE
            goto L_0x0017
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C626635z.A04(X.1ED):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r11.A0Y(X.C58422vE.A02, 6442) == false) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A06(X.AnonymousClass33C r10, X.AnonymousClass1VX r11, boolean r12) {
        /*
            com.whatsapp.InteractiveAnnotation[] r0 = r10.A0X
            if (r0 == 0) goto L_0x014d
            int r0 = r0.length
            if (r0 == 0) goto L_0x014d
            r4 = 0
            if (r12 != 0) goto L_0x0015
            r1 = 6442(0x192a, float:9.027E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r0, r1)
            r12 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r12 = 0
        L_0x0016:
            com.whatsapp.InteractiveAnnotation[] r7 = r10.A0X
            int r6 = r7.length
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r6)
        L_0x001d:
            if (r4 >= r6) goto L_0x014c
            r3 = r7[r4]
            X.1Ci r0 = X.C21571Ci.DEFAULT_INSTANCE
            X.6c9 r2 = r0.A0G()
            r10 = 0
        L_0x0028:
            com.whatsapp.SerializablePoint[] r1 = r3.polygonVertices
            int r0 = r1.length
            if (r10 >= r0) goto L_0x0081
            r0 = r1[r10]
            if (r0 == 0) goto L_0x007e
            X.1Cp r0 = X.C21641Cp.DEFAULT_INSTANCE
            X.6c9 r11 = r0.A0G()
            com.whatsapp.SerializablePoint[] r0 = r3.polygonVertices
            r0 = r0[r10]
            double r0 = r0.x
            X.6cX r9 = X.C18320x8.A0C(r11)
            X.1Cp r9 = (X.C21641Cp) r9
            int r8 = r9.bitField0_
            r8 = r8 | 4
            r9.bitField0_ = r8
            r9.x_ = r0
            com.whatsapp.SerializablePoint[] r0 = r3.polygonVertices
            r0 = r0[r10]
            double r0 = r0.y
            X.6cX r9 = X.C18320x8.A0C(r11)
            X.1Cp r9 = (X.C21641Cp) r9
            int r8 = r9.bitField0_
            r8 = r8 | 8
            r9.bitField0_ = r8
            r9.y_ = r0
            X.6cX r9 = r11.A06()
            X.6cX r8 = X.C18320x8.A0C(r2)
            X.1Ci r8 = (X.C21571Ci) r8
            r9.getClass()
            X.8ya r1 = r8.polygonVertices_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x007b
            X.8ya r1 = X.C130786cX.A07(r1)
            r8.polygonVertices_ = r1
        L_0x007b:
            r1.add(r9)
        L_0x007e:
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0081:
            boolean r0 = r3.skipConfirmation
            if (r0 == 0) goto L_0x0094
            X.6cX r8 = X.C18320x8.A0C(r2)
            X.1Ci r8 = (X.C21571Ci) r8
            r1 = 1
            int r0 = r8.bitField0_
            r0 = r0 | 4
            r8.bitField0_ = r0
            r8.shouldSkipConfirmation_ = r1
        L_0x0094:
            java.lang.Object r9 = r3.data
            boolean r0 = r9 instanceof com.whatsapp.SerializableLocation
            if (r0 == 0) goto L_0x00f6
            com.whatsapp.SerializableLocation r9 = (com.whatsapp.SerializableLocation) r9
            X.1Bx r0 = X.C21461Bx.DEFAULT_INSTANCE
            X.6c9 r11 = r0.A0G()
            double r0 = r9.latitude
            X.6cX r10 = X.C18320x8.A0C(r11)
            X.1Bx r10 = (X.C21461Bx) r10
            int r8 = r10.bitField0_
            r8 = r8 | 1
            r10.bitField0_ = r8
            r10.degreesLatitude_ = r0
            double r0 = r9.longitude
            X.6cX r10 = X.C18320x8.A0C(r11)
            X.1Bx r10 = (X.C21461Bx) r10
            int r8 = r10.bitField0_
            r8 = r8 | 2
            r10.bitField0_ = r8
            r10.degreesLongitude_ = r0
            java.lang.String r8 = r9.name
            X.6cX r1 = X.C18320x8.A0C(r11)
            X.1Bx r1 = (X.C21461Bx) r1
            r8.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.name_ = r8
            X.6cX r1 = X.C18320x8.A0C(r2)
            X.1Ci r1 = (X.C21571Ci) r1
            X.6cX r0 = r11.A06()
            r0.getClass()
            r1.action_ = r0
            r0 = 2
        L_0x00e5:
            r1.actionCase_ = r0
        L_0x00e7:
            if (r12 != 0) goto L_0x00ef
            java.lang.Object r0 = r3.data
            boolean r0 = r0 instanceof com.whatsapp.SerializableLocation
            if (r0 == 0) goto L_0x00f2
        L_0x00ef:
            X.C18320x8.A1B(r2, r5)
        L_0x00f2:
            int r4 = r4 + 1
            goto L_0x001d
        L_0x00f6:
            boolean r0 = r9 instanceof X.C53042mS
            if (r0 == 0) goto L_0x00e7
            X.2mS r9 = (X.C53042mS) r9
            X.1D9 r0 = X.AnonymousClass1D9.DEFAULT_INSTANCE
            X.6c9 r10 = r0.A0G()
            X.4uY r0 = r9.A01
            java.lang.String r8 = r0.getObfuscatedString()
            X.6cX r1 = X.C18320x8.A0C(r10)
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            r8.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r8
            java.lang.String r8 = r9.A03
            X.6cX r1 = X.C18320x8.A0C(r10)
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r8
            int r8 = r9.A00
            if (r8 <= 0) goto L_0x013b
            X.6cX r1 = X.C18320x8.A0C(r10)
            X.1D9 r1 = (X.AnonymousClass1D9) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r8
        L_0x013b:
            X.6cX r1 = X.C18320x8.A0C(r2)
            X.1Ci r1 = (X.C21571Ci) r1
            X.6cX r0 = r10.A06()
            r0.getClass()
            r1.action_ = r0
            r0 = 3
            goto L_0x00e5
        L_0x014c:
            return r5
        L_0x014d:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C626635z.A06(X.33C, X.1VX, boolean):java.util.List");
    }

    public static boolean A09(C624134x r2) {
        byte b = r2.A1I;
        if (b == 11 || b == 31) {
            return true;
        }
        return false;
    }

    public static Pair A05(DeviceJid deviceJid, Jid jid, Jid jid2) {
        if (C627336j.A0K(jid) || (jid instanceof AnonymousClass1fS)) {
            if (deviceJid != null) {
                jid2 = deviceJid;
            }
        } else if (jid2 instanceof AnonymousClass1fS) {
            if (deviceJid != null) {
                jid = deviceJid;
            }
            Jid jid3 = jid2;
            jid2 = jid;
            jid = jid3;
        } else if (deviceJid != null) {
            jid = deviceJid;
        }
        return AnonymousClass0x9.A0C(jid, jid2);
    }

    public static List A07(List list) {
        AnonymousClass20F r0;
        Object obj;
        C21461Bx r02;
        AnonymousClass22e r03;
        LinkedList A18 = AnonymousClass0x9.A18();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21571Ci r6 = (C21571Ci) it.next();
            SerializablePoint[] serializablePointArr = new SerializablePoint[r6.polygonVertices_.size()];
            int i = 0;
            while (true) {
                if (i < r6.polygonVertices_.size()) {
                    C21641Cp r7 = (C21641Cp) r6.polygonVertices_.get(i);
                    int i2 = r7.bitField0_;
                    if ((i2 & 1) == 0 && (i2 & 2) == 0) {
                        serializablePointArr[i] = new SerializablePoint(r7.x_, r7.y_);
                        i++;
                    } else {
                        Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
                    }
                } else {
                    int i3 = r6.actionCase_;
                    if (i3 == 0) {
                        r0 = AnonymousClass20F.ACTION_NOT_SET;
                    } else if (i3 == 2) {
                        r0 = AnonymousClass20F.LOCATION;
                    } else if (i3 != 3) {
                        r0 = null;
                    } else {
                        r0 = AnonymousClass20F.NEWSLETTER;
                    }
                    boolean z = r6.shouldSkipConfirmation_;
                    int ordinal = r0.ordinal();
                    if (ordinal == 0) {
                        if (i3 == 2) {
                            r02 = (C21461Bx) r6.action_;
                        } else {
                            r02 = C21461Bx.DEFAULT_INSTANCE;
                        }
                        obj = new SerializableLocation(r02.name_, r02.degreesLatitude_, r02.degreesLongitude_);
                    } else if (ordinal == 1 && i3 == 3) {
                        AnonymousClass1D9 r8 = (AnonymousClass1D9) r6.action_;
                        C95804uY A01 = C95804uY.A03.A01(r8.newsletterJid_);
                        if (A01 == null) {
                            Log.w("MessageUtils/getForwardedNewsletterMessageInfo/error invalid newsletter jid");
                        } else {
                            int i4 = r8.serverMessageId_;
                            String str = r8.newsletterName_;
                            int i5 = r8.contentType_;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    r03 = AnonymousClass22e.UPDATE_CARD;
                                } else if (i5 == 3) {
                                    r03 = AnonymousClass22e.LINK_CARD;
                                }
                                obj = new C53042mS(A01, AnonymousClass28U.A00(Integer.valueOf(r03.value)), str, i4);
                            }
                            r03 = AnonymousClass22e.UPDATE;
                            obj = new C53042mS(A01, AnonymousClass28U.A00(Integer.valueOf(r03.value)), str, i4);
                        }
                    }
                    A18.add(new InteractiveAnnotation(obj, serializablePointArr, z));
                }
            }
            Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
        }
        return A18;
    }

    public static void A08(AnonymousClass33C r3, AnonymousClass1VX r4, List list, List list2) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (r4.A0Y(C58422vE.A02, 6444)) {
            A0s.addAll(A07(list2));
        }
        if (A0s.isEmpty()) {
            A0s.addAll(A07(list));
        }
        if (!A0s.isEmpty()) {
            r3.A0X = (InteractiveAnnotation[]) A0s.toArray(new InteractiveAnnotation[0]);
        }
    }

    public static boolean A0A(AnonymousClass2z0 r5, String str) {
        StringBuilder A0o;
        String str2;
        if (TextUtils.isEmpty(str)) {
            A0o = AnonymousClass001.A0o();
            A0o.append("MessageUtil/isValidMediaUrl/error empty media url received. message.key=");
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                A0o = AnonymousClass001.A0o();
                str2 = "MessageUtil/isValidMediaUrl/error invalid scheme on received media url; url=";
            } else if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().endsWith(".whatsapp.net")) {
                return true;
            } else {
                A0o = AnonymousClass001.A0o();
                str2 = "MessageUtil/isValidMediaUrl/error invalid host on received media url; url=";
            }
            AnonymousClass001.A1K(str2, str, "; message.key=", A0o);
        }
        C18270x1.A17(r5, A0o);
        return false;
    }
}
