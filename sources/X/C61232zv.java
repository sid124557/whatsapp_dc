package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2zv  reason: invalid class name and case insensitive filesystem */
public class C61232zv {
    public final C64773Ex A00;
    public final C56642sK A01;
    public final C50632iV A02;
    public final C56982ss A03;
    public final C56892sj A04;
    public final C61142zm A05;
    public final C55832qz A06;
    public final C183538qC A07;
    public final HashSet A08 = AnonymousClass002.A0K();
    public final HashSet A09 = AnonymousClass002.A0K();

    public boolean A03(C52952mJ r6, C209619z r7, C624134x r8) {
        if (r8 != null) {
            try {
                AnonymousClass1A3 A022 = ((AnonymousClass33H) this.A07.get()).A02(r6, r8);
                if (A022 != null) {
                    C130546c9 A0K = C18300x5.A0K(C21411Bs.DEFAULT_INSTANCE);
                    C21411Bs r1 = (C21411Bs) A0K.A00;
                    AnonymousClass1ES r0 = (AnonymousClass1ES) A022.A06();
                    r0.getClass();
                    r1.message_ = r0;
                    r1.bitField0_ |= 1;
                    long j = r8.A1L;
                    C21411Bs r12 = (C21411Bs) C18320x8.A0C(A0K);
                    r12.bitField0_ |= 2;
                    r12.msgOrderId_ = j;
                    C130786cX A062 = A0K.A06();
                    AnonymousClass1EG A0U = C18290x4.A0U(r7);
                    A062.getClass();
                    C188248ya r13 = A0U.messages_;
                    if (!((AnonymousClass8T6) r13).A00) {
                        r13 = C130786cX.A07(r13);
                        A0U.messages_ = r13;
                    }
                    r13.add(A062);
                    return true;
                }
            } catch (AnonymousClass24A e) {
                Log.e("HistorySyncUtils/addMessage/invalid message", e);
                return false;
            }
        }
        return false;
    }

    public C209619z A00(C95814uZ r12, Map map, Map map2) {
        int i;
        int i2;
        Long l;
        C209619z r4 = (C209619z) AnonymousClass1EG.DEFAULT_INSTANCE.A0G();
        String A0i = C18300x5.A0i(r12);
        AnonymousClass1EG A0N = C18280x3.A0N(r4, A0i);
        A0N.bitField0_ |= 1;
        A0N.id_ = A0i;
        C56982ss r7 = this.A03;
        AnonymousClass31A A002 = C56982ss.A00(r7, r12);
        if (A002 != null) {
            if (A002.A07() != null) {
                String A072 = A002.A07();
                AnonymousClass1EG A0N2 = C18280x3.A0N(r4, A072);
                A0N2.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                A0N2.name_ = A072;
            }
            synchronized (A002) {
                i = A002.A04;
            }
            boolean z = true;
            boolean A1U = AnonymousClass000.A1U(i, 1);
            AnonymousClass1EG A0U = C18290x4.A0U(r4);
            A0U.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            A0U.notSpam_ = A1U;
            boolean z2 = A002.A0i;
            AnonymousClass1EG A0U2 = C18290x4.A0U(r4);
            A0U2.bitField0_ |= 16384;
            A0U2.archived_ = z2;
            long max = Math.max(C18290x4.A0B(A002.A02()), 0);
            AnonymousClass1EG A0U3 = C18290x4.A0U(r4);
            A0U3.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            A0U3.conversationTimestamp_ = max;
            int max2 = Math.max(A002.A0b.expiration, 0);
            AnonymousClass1EG A0U4 = C18290x4.A0U(r4);
            A0U4.bitField0_ |= 128;
            A0U4.ephemeralExpiration_ = max2;
            long max3 = Math.max(A002.A0b.ephemeralSettingTimestamp, 0);
            AnonymousClass1EG A0U5 = C18290x4.A0U(r4);
            A0U5.bitField0_ |= 256;
            A0U5.ephemeralSettingTimestamp_ = max3;
            synchronized (A002) {
                i2 = A002.A0A;
            }
            int max4 = Math.max(i2, 0);
            AnonymousClass1EG A0U6 = C18290x4.A0U(r4);
            A0U6.bitField0_ |= 16;
            A0U6.unreadCount_ = max4;
            if (((long) A002.A08) != -1) {
                z = false;
            }
            AnonymousClass1EG A0U7 = C18290x4.A0U(r4);
            A0U7.bitField0_ |= AnonymousClass35S.A0F;
            A0U7.markedAsUnread_ = z;
            boolean A0M = r7.A0M(r12);
            AnonymousClass1EG A0U8 = C18290x4.A0U(r4);
            A0U8.bitField0_ |= 32;
            A0U8.readOnly_ = A0M;
            int A022 = r7.A02(r12);
            AnonymousClass1EG A0U9 = C18290x4.A0U(r4);
            A0U9.bitField0_ |= 65536;
            A0U9.unreadMentionCount_ = A022;
            if (r12 instanceof GroupJid) {
                String A0C = C56892sj.A01(this.A04, (C28011fL) r12).A0C();
                AnonymousClass1EG A0N3 = C18280x3.A0N(r4, A0C);
                A0N3.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                A0N3.pHash_ = A0C;
                boolean z3 = this.A00.A0A(r12).A0s;
                AnonymousClass1EG A0U10 = C18290x4.A0U(r4);
                A0U10.bitField0_ |= 67108864;
                A0U10.suspended_ = z3;
            } else {
                AnonymousClass2K8 r5 = (AnonymousClass2K8) map.get(r12);
                if (r5 != null) {
                    C172548Lq A092 = C18270x1.A09(r4, r5.A01);
                    AnonymousClass1EG r2 = (AnonymousClass1EG) r4.A00;
                    r2.bitField0_ |= 262144;
                    r2.tcToken_ = A092;
                    long longValue = r5.A00.longValue();
                    AnonymousClass1EG A0U11 = C18290x4.A0U(r4);
                    A0U11.bitField0_ |= 524288;
                    A0U11.tcTokenTimestamp_ = longValue;
                }
                AnonymousClass2K9 r0 = (AnonymousClass2K9) map2.get(r12);
                if (!(r0 == null || (l = r0.A01) == null)) {
                    long longValue2 = l.longValue();
                    AnonymousClass1EG A0U12 = C18290x4.A0U(r4);
                    A0U12.bitField0_ |= 33554432;
                    A0U12.tcTokenSenderTimestamp_ = longValue2;
                    return r4;
                }
            }
        }
        return r4;
    }

    public Map A01(Cursor cursor, C52952mJ r11, AnonymousClass4AV r12, long j) {
        HashSet hashSet;
        int i;
        C56642sK r0 = this.A01;
        Map A062 = r0.A06();
        Map A072 = r0.A07();
        LinkedHashMap A0r = C18320x8.A0r();
        while (cursor.moveToNext()) {
            C624134x A032 = this.A06.A03(cursor);
            if (A032 != null) {
                C50632iV r02 = this.A02;
                AnonymousClass2z0 r7 = A032.A1J;
                r02.A01(r7);
                if (r12 != null) {
                    C86184Jd r1 = (C86184Jd) r12;
                    if (r1.A01 != 0) {
                        ((AnonymousClass36W) r1.A00).A0M(A032);
                    }
                }
                if (A032.A0K < j) {
                    break;
                }
                C95814uZ r72 = r7.A00;
                if (r72 != null && !(A032 instanceof C30401mO)) {
                    if (r11.A02 || !C155477ey.A00(r72)) {
                        C209619z r6 = (C209619z) A0r.get(r72);
                        if (r6 == null) {
                            r6 = A00(r72, A062, A072);
                            A0r.put(r72, r6);
                        }
                        boolean A033 = A03(r11, r6, A032);
                        int i2 = r11.A00;
                        if (i2 > 0) {
                            Iterator it = this.A05.A01(Collections.singletonList(A032), i2).iterator();
                            while (it.hasNext()) {
                                A03(r11, r6, C18300x5.A0T(it));
                            }
                        }
                        if (!A033) {
                            if (A032 instanceof C30341mI) {
                                hashSet = this.A08;
                                i = ((C30341mI) A032).A00;
                            } else {
                                hashSet = this.A09;
                                i = A032.A1I;
                            }
                            C18270x1.A1K(hashSet, i);
                        }
                    } else {
                        C18260x0.A1P(AnonymousClass001.A0o(), "history-sync-utils/skipChatWithBot jid=", r72);
                    }
                }
            }
        }
        return A0r;
    }

    public void A02(C28011fL r8, C209619z r9) {
        C60842zG A052;
        C374322p r0;
        C620833k A012 = C56892sj.A01(this.A04, r8);
        C172878Nf it = C129526aS.copyOf((Collection) A012.A09.keySet()).iterator();
        while (it.hasNext()) {
            UserJid A0T = C18310x6.A0T(it);
            if (!(A0T == null || (A052 = A012.A05(A0T)) == null)) {
                C130546c9 A0G = C21401Br.DEFAULT_INSTANCE.A0G();
                String A0g = C18300x5.A0g(A0G, A052.A03);
                C21401Br r1 = (C21401Br) A0G.A00;
                A0g.getClass();
                r1.bitField0_ |= 1;
                r1.userJid_ = A0g;
                int i = A052.A01;
                if (i != 0) {
                    if (i == 1) {
                        r0 = C374322p.ADMIN;
                    } else if (i != 2) {
                        r0 = null;
                    } else {
                        r0 = C374322p.SUPERADMIN;
                    }
                    C21401Br r12 = (C21401Br) C18320x8.A0C(A0G);
                    r12.rank_ = r0.value;
                    r12.bitField0_ |= 2;
                }
                AnonymousClass1EG A0U = C18290x4.A0U(r9);
                C130786cX A062 = A0G.A06();
                A062.getClass();
                C188248ya r13 = A0U.participant_;
                if (!((AnonymousClass8T6) r13).A00) {
                    r13 = C130786cX.A07(r13);
                    A0U.participant_ = r13;
                }
                r13.add(A062);
            }
        }
    }

    public C61232zv(C64773Ex r2, C56642sK r3, C50632iV r4, C56982ss r5, C56892sj r6, C61142zm r7, C55832qz r8, C183538qC r9) {
        this.A03 = r5;
        this.A00 = r2;
        this.A06 = r8;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
        this.A07 = r9;
        this.A04 = r6;
    }
}
