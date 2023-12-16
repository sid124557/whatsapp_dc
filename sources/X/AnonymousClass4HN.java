package X;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4HN  reason: invalid class name */
public class AnonymousClass4HN extends C54252oQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4HN(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A01(AnonymousClass36K r9) {
        if (this.A02 != 0) {
            super.A01(r9);
            return;
        }
        int A012 = C57492tj.A01(r9);
        if (A012 == 207) {
            Iterator A0M = AnonymousClass36K.A0M(r9, "error");
            while (A0M.hasNext()) {
                Iterator A0M2 = AnonymousClass36K.A0M(C18310x6.A0Y(A0M), "error");
                while (A0M2.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(A0M2);
                    String A0r = A0Y.A0r("code", (String) null);
                    String A0r2 = A0Y.A0r("text", (String) null);
                    if (A0r != null) {
                        int A013 = C615531h.A01(A0r, 0);
                        C60592yo r1 = ((AnonymousClass30X) this.A00).A09;
                        Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
                        C83904Ag r2 = r1.A01;
                        Bundle A08 = AnonymousClass002.A08();
                        A08.putInt("errorCode", A013);
                        A08.putString("errorText", A0r2);
                        AnonymousClass0x2.A16(r2, A08, 196);
                    }
                }
            }
            return;
        }
        C60592yo r12 = ((AnonymousClass30X) this.A00).A09;
        Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
        C83904Ag r22 = r12.A01;
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("errorCode", A012);
        AnonymousClass0x2.A16(r22, A082, 78);
    }

    public void A02(AnonymousClass36K r30) {
        byte b;
        byte[] bArr;
        C42612Ov r16;
        AnonymousClass36K r4 = r30;
        switch (this.A02) {
            case 0:
                C60592yo r1 = ((AnonymousClass30X) this.A00).A09;
                Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-success");
                r1.A01.Bfr(AnonymousClass0x7.A0G(77));
                return;
            case 1:
                AnonymousClass36K A0m = r4.A0m("list");
                DeviceJid[] deviceJidArr = (DeviceJid[]) this.A01;
                int length = deviceJidArr.length;
                HashSet hashSet = new HashSet(length);
                HashMap hashMap = new HashMap(length);
                AnonymousClass36K[] r10 = A0m.A03;
                int i = 0;
                if (r10 != null) {
                    Arrays.sort(r10, new AnonymousClass4IU(34));
                    ArrayList A0s = AnonymousClass001.A0s();
                    int length2 = r10.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        AnonymousClass36K r8 = r10[i2];
                        DeviceJid deviceJid = (DeviceJid) r8.A0h(DeviceJid.class, "jid");
                        AnonymousClass36K A0l = r8.A0l("error");
                        if (A0l != null) {
                            int A022 = AnonymousClass36K.A02(A0l, "code");
                            hashSet.add(deviceJid);
                            AnonymousClass0x2.A1I(deviceJid, hashMap, A022);
                        } else {
                            AnonymousClass36K A0m2 = r8.A0m("identity");
                            AnonymousClass36K A0l2 = r8.A0l("device-identity");
                            AnonymousClass36K A0m3 = r8.A0m("registration");
                            AnonymousClass36K A0l3 = r8.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0l3 == null) {
                                b = 5;
                            } else {
                                byte[] bArr2 = A0l3.A01;
                                if (bArr2 == null || bArr2.length != 1) {
                                    throw AnonymousClass24Y.A01("type node should contain exactly 1 byte");
                                }
                                b = bArr2[i];
                            }
                            AnonymousClass36K A0l4 = r8.A0l("key");
                            if (A0l4 != null) {
                                bArr = null;
                                r16 = new C42612Ov(A0l4.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0l4.A0m("value").A01, (byte[]) null);
                            } else {
                                bArr = null;
                                r16 = null;
                            }
                            AnonymousClass36K A0m4 = r8.A0m("skey");
                            AnonymousClass36K A0m5 = A0m4.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            AnonymousClass36K A0m6 = A0m4.A0m("value");
                            AnonymousClass36K A0m7 = A0m4.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                            byte[] bArr3 = A0m2.A01;
                            byte[] bArr4 = A0m3.A01;
                            if (A0l2 != null) {
                                bArr = A0l2.A01;
                            }
                            A0s.add(new AnonymousClass2T8(deviceJid, r16, new C42612Ov(A0m5.A01, A0m6.A01, A0m7.A01), bArr3, bArr4, bArr, b));
                            hashSet.add(deviceJid);
                        }
                        i2++;
                        i = 0;
                    }
                    if (!A0s.isEmpty()) {
                        C60592yo r3 = ((AnonymousClass30X) this.A00).A09;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-success");
                        AnonymousClass0x2.A16(r3.A01, A0s, 74);
                    }
                }
                SparseArray sparseArray = new SparseArray();
                while (i < length) {
                    DeviceJid deviceJid2 = deviceJidArr[i];
                    if (!hashSet.contains(deviceJid2)) {
                        C60592yo r32 = ((AnonymousClass30X) this.A00).A09;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-none");
                        C83904Ag r42 = r32.A01;
                        Bundle A08 = AnonymousClass002.A08();
                        C384027k.A00(A08, deviceJid2, "jid");
                        AnonymousClass0x2.A16(r42, A08, 75);
                    }
                    if (hashMap.containsKey(deviceJid2)) {
                        int A0K = AnonymousClass001.A0K(hashMap.get(deviceJid2));
                        List list = (List) sparseArray.get(A0K);
                        if (list != null) {
                            list.add(deviceJid2);
                        } else {
                            sparseArray.put(A0K, C18300x5.A0s(deviceJid2));
                        }
                    }
                    i++;
                }
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((AnonymousClass30X) this.A00).A09.A03((DeviceJid[]) ((List) sparseArray.valueAt(i3)).toArray(new DeviceJid[0]), sparseArray.keyAt(i3));
                }
                return;
            default:
                C626836d.A0E(C41032Ir.A02(r4, (C41032Ir) this.A01), r4, 12);
                String[] strArr = {null};
                String[] strArr2 = {null};
                String[] strArr3 = {null};
                String[] strArr4 = {null};
                String[] strArr5 = {null};
                String[] strArr6 = {null};
                String[] strArr7 = {null};
                for (C34821vs r12 : C626836d.A0B(r4, C86304Jp.A00(86), new String[]{"config"}, 0, 2)) {
                    ((C84304Bv) r12.A00).AwE(new C58892vz(this, strArr, strArr4, strArr2, strArr3, strArr5, strArr6, strArr7));
                }
                C60592yo r13 = ((AnonymousClass30X) this.A00).A09;
                String str = strArr[0];
                String str2 = strArr2[0];
                String str3 = strArr3[0];
                String str4 = strArr4[0];
                String str5 = strArr5[0];
                String str6 = strArr6[0];
                String str7 = strArr7[0];
                Log.i("ConnectionThreadRequestsImpl/client_config");
                C83904Ag r2 = r13.A01;
                Bundle A082 = AnonymousClass002.A08();
                A082.putString("gcmToken", str);
                A082.putString("fbnsToken", str2);
                A082.putString("mutedChatsHash", str3);
                A082.putString("appMuteConfig", str4);
                A082.putString("num_acc", str5);
                A082.putString("pkey", str6);
                A082.putString("voip_payload_type", str7);
                AnonymousClass0x2.A16(r2, A082, 6);
                return;
        }
    }
}
