package X;

import java.nio.ByteBuffer;

/* renamed from: X.6mb  reason: invalid class name and case insensitive filesystem */
public class C136396mb extends C150447Qt {
    public static byte[] A01(C151467Ux r3, byte[] bArr) {
        return r3.A02(bArr, C162257rX.A0A("iv", new byte[0], 12), 12);
    }

    public static byte[] A02(C151467Ux r3, byte[] bArr) {
        return r3.A02(bArr, C162257rX.A0A("key", new byte[0], 16), 16);
    }

    public static void A00(C171558Hn r2) {
        r2.A0C.A02 = System.currentTimeMillis();
    }

    public /* bridge */ /* synthetic */ void A03(C179548jK r20, AnonymousClass7EH r21, C149817Nz r22, int i) {
        C136656n2 r12;
        C171558Hn r13 = (C171558Hn) r20;
        A00(r13);
        AnonymousClass7EH r14 = r21;
        C149817Nz r15 = r22;
        int i2 = i;
        if (r14 instanceof C136616mx) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(C154377d4.A00((byte[]) r14.A00));
                byte b = wrap.get();
                if (b == 1 || b == 0) {
                    byte[] A02 = r13.A09.A02(AnonymousClass6CA.A0h("server_app_traffic_secret", r13.A0U), C162257rX.A0A("traffic upd", new byte[0], r13.A02), r13.A02);
                    r13.A0U.put("server_app_traffic_secret", A02);
                    r13.A0U.put("server_app_key", r13.A09.A02(A02, C162257rX.A0A("key", new byte[0], 16), 16));
                    r13.A0U.put("server_app_iv", r13.A09.A02(A02, C162257rX.A0A("iv", new byte[0], 12), 12));
                    int i3 = r13.A03 + 1;
                    r13.A03 = i3;
                    C141976wR r6 = C141976wR.DEBUG;
                    C155097eH.A00(r6, AnonymousClass000.A0Y("Updated Server App Traffic Keys : Current Gen = ", AnonymousClass001.A0o(), i3));
                    C152927aO r0 = r13.A0A;
                    if (r0 == null || r0.A00.available() <= 0) {
                        C171548Hm r4 = new C171548Hm();
                        r4.A00(AnonymousClass6CA.A0h("server_app_key", r13.A0U), AnonymousClass6CA.A0h("server_app_iv", r13.A0U));
                        r13.A0A = new C136676n4(r4, r13.A08, r13.A0M);
                        if (b == 1) {
                            byte[] A01 = C154377d4.A01(new byte[]{0}, (byte) 24);
                            r13.A0B.A01(A01, 0, A01.length, (byte) 23);
                            byte[] A00 = C151467Ux.A00(r13.A09, r13, "traffic upd", new byte[0], AnonymousClass6CA.A0h("client_app_traffic_secret", r13.A0U));
                            r13.A0U.put("client_app_traffic_secret", A00);
                            r13.A0U.put("client_app_key", A02(r13.A09, A00));
                            r13.A0U.put("client_app_iv", A01(r13.A09, A00));
                            int i4 = r13.A01 + 1;
                            r13.A01 = i4;
                            C155097eH.A00(r6, AnonymousClass000.A0Y("Updated Client App Traffic Keys : Current Gen = ", AnonymousClass001.A0o(), i4));
                            C171548Hm r2 = new C171548Hm();
                            r2.A00(AnonymousClass6CA.A0h("client_app_key", r13.A0U), AnonymousClass6CA.A0h("client_app_iv", r13.A0U));
                            r13.A0B = new C136686n6(r2, r13.A0N);
                        }
                        if (wrap.hasRemaining()) {
                            r12 = new C136656n2(r13, r14, r15, "Key update message has more than expected bytes.", C143806zV.A01("Key update message has more than expected bytes.", (byte) 80), i2);
                        } else {
                            return;
                        }
                    } else {
                        r12 = new C136656n2(r13, r14, r15, "Unexpected Messages: Found pending handshake messages", C143806zV.A01("Found unprocessed messages in handshake buffer.", (byte) 10), i2);
                    }
                } else {
                    r12 = new C136656n2(r13, r14, r15, C18260x0.A05("Invalid key update type ", b), C143806zV.A01(C18260x0.A05("Invalid key update type ", b), (byte) 10), i2);
                }
                throw r12;
            } catch (C143806zV e) {
                throw new C136656n2(r13, r14, r15, "Receive key update failed.", e, i2);
            }
        } else {
            throw new C136656n2(r13, r14, r15, "Unexpected event type", C143806zV.A01("Unexpected event", (byte) 80), i2);
        }
    }
}
