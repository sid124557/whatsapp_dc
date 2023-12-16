package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Lz  reason: invalid class name and case insensitive filesystem */
public class C22301Lz extends AnonymousClass3CG {
    public final C385628e A00;

    public C22301Lz(C385628e r2) {
        super("bk.action.apt.PleEncrypt");
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r16, C146787Bp r17, C151147Tp r18) {
        Throwable th;
        if (r17.A00.equals("bk.action.apt.PleEncrypt")) {
            HashMap A0t = AnonymousClass001.A0t();
            List list = r16.A00;
            AnonymousClass84O r9 = (AnonymousClass84O) list.get(0);
            String A0O = r9.A0O(41);
            String A0O2 = r9.A0O(35);
            Long valueOf = Long.valueOf(r9.A0F(36, -1));
            Long valueOf2 = Long.valueOf(r9.A0F(38, -1));
            A0t.put("purpose", A0O);
            A0t.put("publicKey", A0O2);
            A0t.put("serverTimestamp", valueOf);
            A0t.put("validTilTimestamp", valueOf2);
            String A0s = C18290x4.A0s(list);
            AnonymousClass8DF A002 = AnonymousClass3CG.A00(list, 2);
            AnonymousClass8DF A003 = AnonymousClass3CG.A00(list, 3);
            C86034Io r7 = new C86034Io(A002, 27);
            try {
                String A0e = C18320x8.A0e("purpose", A0t);
                if (A0e != null) {
                    byte[] decode = Base64.decode(C18320x8.A0e("publicKey", A0t), 8);
                    Long l = (Long) A0t.get("serverTimestamp");
                    if (l != null) {
                        Long l2 = (Long) A0t.get("validTilTimestamp");
                        if (l2 != null) {
                            int length = decode.length;
                            if (length == 32) {
                                byte[] copyOf = Arrays.copyOf(decode, length);
                                long longValue = l.longValue();
                                if (longValue <= 0) {
                                    th = AnonymousClass000.A0E(l, "Invalid value for serverTimestamp: ", AnonymousClass001.A0o());
                                } else if (l2.longValue() > 0) {
                                    byte[] bArr = new byte[24];
                                    C57912uP.A00.nextBytes(bArr);
                                    AnonymousClass2KI A004 = AnonymousClass36G.A00();
                                    byte[] A02 = C159457lr.A02(C161227pF.A00(Arrays.copyOf(copyOf, copyOf.length), A004.A00.A01), bArr, A0s.getBytes());
                                    byte[] bArr2 = A004.A01.A01;
                                    int length2 = bArr2.length + 24 + A02.length;
                                    ByteBuffer allocate = ByteBuffer.allocate(A0e.getBytes().length + 5 + 8 + length2 + 16);
                                    allocate.order(ByteOrder.BIG_ENDIAN);
                                    allocate.put((byte) 4);
                                    allocate.putInt(4);
                                    allocate.putInt(0);
                                    allocate.putInt(A0e.length());
                                    allocate.put(A0e.getBytes());
                                    allocate.putInt(8);
                                    allocate.putLong(longValue);
                                    allocate.putInt(length2);
                                    allocate.put(bArr2);
                                    allocate.put(bArr);
                                    allocate.put(A02);
                                    if (!allocate.hasRemaining()) {
                                        String encodeToString = Base64.encodeToString(allocate.array(), 8);
                                        C131266dJ A03 = AnonymousClass8DJ.A03(r18);
                                        C152057Xj r1 = new C152057Xj();
                                        r1.A04(encodeToString, 0);
                                        C157157hp.A00(A03, r1.A03(), (C835248t) r7.A00);
                                        return null;
                                    }
                                    th = AnonymousClass001.A0e("Ciphertext array not fully written");
                                } else {
                                    th = AnonymousClass000.A0E(l2, "Invalid value for validTilTime: ", AnonymousClass001.A0o());
                                }
                            } else {
                                th = AnonymousClass000.A0G("Invalid length for serverPublicKey: ", AnonymousClass001.A0o(), length);
                            }
                        } else {
                            th = AnonymousClass001.A0g("validTilTimestamp must not be null");
                        }
                    } else {
                        th = AnonymousClass001.A0g("serverTimestamp must not be null");
                    }
                } else {
                    th = AnonymousClass001.A0g("purpose must not be null");
                }
                throw th;
            } catch (RuntimeException unused) {
                C131266dJ A032 = AnonymousClass8DJ.A03(r18);
                C152057Xj r2 = new C152057Xj();
                r2.A04(0, 0);
                C157157hp.A00(A032, r2.A03(), (C835248t) new C86034Io(A003, 28).A00);
            }
        }
        return null;
    }
}
