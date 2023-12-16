package X;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.util.Log;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4On  reason: invalid class name and case insensitive filesystem */
public class C87234On extends CursorAdapter {
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06 = Long.MIN_VALUE;
    public AnonymousClass0R2 A07;
    public C129586aY A08 = C129586aY.of();
    public AnonymousClass5OW A09;
    public AnonymousClass5ND A0A;
    public AnonymousClass5JR A0B;
    public C624134x A0C;
    public AnonymousClass2z0 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H;
    public final SparseArray A0I = new SparseArray();
    public final C009707r A0J;
    public final C56972sr A0K;
    public final AnonymousClass5MS A0L;
    public final C105165Tv A0M;
    public final AnonymousClass677 A0N;
    public final C106435Yz A0O;
    public final C56612sH A0P;
    public final AnonymousClass33p A0Q;
    public final AnonymousClass1VX A0R;
    public final C95814uZ A0S;
    public final C52552lf A0T;
    public final AnonymousClass35J A0U;
    public final C55832qz A0V;
    public final HashSet A0W = AnonymousClass002.A0K();
    public final HashSet A0X = AnonymousClass002.A0K();
    public final HashSet A0Y = AnonymousClass002.A0K();
    public final HashSet A0Z = AnonymousClass002.A0K();
    public final List A0a = AnonymousClass001.A0s();
    public final Set A0b = AnonymousClass002.A0K();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87234On(C009707r r4, C56972sr r5, AnonymousClass5MS r6, C105165Tv r7, AnonymousClass677 r8, C106435Yz r9, C56612sH r10, AnonymousClass33p r11, AnonymousClass1VX r12, C95814uZ r13, C52552lf r14, C103985Pe r15, AnonymousClass35J r16, C55832qz r17) {
        super(r4, (Cursor) null, false);
        boolean z = false;
        this.A0P = r10;
        this.A0S = r13;
        this.A0K = r5;
        this.A0U = r16;
        this.A0V = r17;
        this.A0T = r14;
        this.A0O = r9;
        this.A0N = r8;
        this.A0J = r4;
        this.A0M = r7;
        this.A0L = r6;
        this.A0R = r12;
        this.A0Q = r11;
        if ((r13 instanceof C95804uY) && r15.A01((C95804uY) r13)) {
            z = true;
        }
        this.A0H = z;
    }

    public void changeCursor(Cursor cursor) {
        this.A0F = true;
        if (cursor != null) {
            this.A01 = cursor.getCount();
        }
        super.changeCursor(cursor);
    }

    public int A01() {
        if (this.A0H) {
            return 0;
        }
        return (this.A01 + this.A08.size()) - this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 != 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.AnonymousClass58K r7, int r8) {
        /*
            r6 = this;
            X.58K r0 = X.AnonymousClass58K.NONE
            if (r7 == r0) goto L_0x0022
            X.58K r0 = X.AnonymousClass58K.TOP
            if (r7 == r0) goto L_0x0022
            X.34x r5 = r6.getItem(r8)
            X.C626936e.A06(r5)
            X.5MS r0 = r6.A0L
            X.58L r0 = r0.A00(r5)
            int r1 = r0.ordinal()
            r4 = 1
            if (r1 == r4) goto L_0x0023
            r0 = 3
            if (r1 == r0) goto L_0x0040
            r0 = 2
            if (r1 == r0) goto L_0x0056
        L_0x0022:
            return r8
        L_0x0023:
            int r3 = r8 + -1
            r2 = r5
        L_0x0026:
            if (r3 < 0) goto L_0x0040
            X.34x r1 = r6.getItem(r3)
            if (r1 == 0) goto L_0x005c
            int r0 = r3 + 1
            boolean r0 = r6.A0A(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A09(r1)
            if (r0 == 0) goto L_0x005c
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0026
        L_0x0040:
            int r3 = r8 + -1
        L_0x0042:
            if (r3 < 0) goto L_0x0056
            X.34x r1 = r6.getItem(r3)
            if (r1 == 0) goto L_0x005c
            X.5Yz r0 = r6.A0O
            boolean r0 = r0.A01(r1, r5)
            if (r0 == 0) goto L_0x005c
            int r3 = r3 + -1
            r5 = r1
            goto L_0x0042
        L_0x0056:
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x0022
            int r8 = r8 - r4
            return r8
        L_0x005c:
            int r0 = r3 + 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87234On.A02(X.58K, int):int");
    }

    /* renamed from: A05 */
    public C624134x getItem(int i) {
        C624134x r7 = null;
        if (!this.A0H) {
            if (this.A05 <= 0 || i != A01()) {
                Cursor cursor = getCursor();
                if (cursor != null) {
                    int A012 = A01();
                    int i2 = i;
                    if (i > A012) {
                        i2 = i - 1;
                    }
                    int i3 = this.A01;
                    if (i2 < i3) {
                        SparseArray sparseArray = this.A0I;
                        r7 = (C624134x) sparseArray.get(i2);
                        if (r7 == null) {
                            int position = cursor.getPosition();
                            cursor.moveToPosition((this.A01 - 1) - i2);
                            int position2 = cursor.getPosition();
                            try {
                                r7 = this.A0V.A04(cursor, this.A0S);
                                if (position2 < position) {
                                    int i4 = this.A00;
                                    if (position2 <= i4 || position2 > i4 + 50) {
                                        int max = Math.max(0, position2 - 50);
                                        this.A00 = max;
                                        cursor.moveToPosition(max);
                                    }
                                }
                                sparseArray.put(i2, r7);
                            } catch (CursorIndexOutOfBoundsException e) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                StringBuilder A0w = C18290x4.A0w("ConversationCursorAdapter/getItem out-of-bounds", A0o);
                                A0w.append(" unseenRowCount:");
                                A0w.append(this.A05);
                                A0w.append(" unseenMsgCount:");
                                A0w.append(this.A03);
                                A0w.append(" unseenCallCount:");
                                A0w.append(this.A04);
                                A0w.append(" cachePos:");
                                A0w.append(this.A00);
                                A0w.append(" appended:");
                                A0w.append(this.A08.size());
                                A0w.append(" db:");
                                A0w.append(sparseArray.size());
                                A0w.append(" jidString:");
                                C95814uZ r1 = this.A0S;
                                A0w.append(r1);
                                A0w.append(" jidType:");
                                A0w.append(r1.getType());
                                AnonymousClass000.A1B(A0w, A0o);
                                A0o.append(" cursorCount:");
                                A0o.append(this.A01);
                                A0o.append(" dataPos:");
                                A0o.append(i2);
                                A0o.append(" viewPos:");
                                A0o.append(i);
                                A0o.append(" dividerPos:");
                                A0o.append(A012);
                                A0o.append(" oldPos:");
                                A0o.append(position);
                                C18260x0.A0x(" newPos:", A0o, position2);
                                throw e;
                            }
                        }
                    } else {
                        int i5 = i2 - i3;
                        if (i5 >= 0 && i5 < this.A08.size()) {
                            r7 = C18320x8.A0R(this.A08, i2 - this.A01);
                        }
                    }
                    for (C182168ny BYb : this.A0a) {
                        BYb.BYb(r7);
                    }
                }
            } else {
                if (this.A0C == null) {
                    C30481mW r12 = new C30481mW(AnonymousClass35J.A01((C95814uZ) null, this.A0U), this.A0P.A0H());
                    this.A0C = r12;
                    r12.A1Z("dummy msg!");
                }
                return this.A0C;
            }
        }
        return r7;
    }

    public void A06(C129586aY r3) {
        Object valueOf;
        this.A08 = r3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversationCursorAdapter/appendMessage: cursor=");
        if (getCursor() == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(this.A01);
        }
        A0o.append(valueOf);
        A0o.append(" appended=");
        C18260x0.A1F(A0o, this.A08.size());
    }

    public void A07(AnonymousClass5MU r7) {
        int intValue;
        AnonymousClass5MU r5 = this.A0M.A09;
        ConcurrentHashMap concurrentHashMap = r7.A00;
        Enumeration keys = concurrentHashMap.keys();
        C162457s7.A0D(keys);
        AnonymousClass8O8 r3 = new AnonymousClass8O8(keys);
        while (r3.hasNext()) {
            Object next = r3.next();
            C162457s7.A0J(next, 0);
            Number A0p = AnonymousClass0x9.A0p(next, concurrentHashMap);
            if (A0p == null) {
                intValue = 0;
            } else {
                intValue = A0p.intValue();
            }
            r5.A00.put(next, Integer.valueOf(intValue));
        }
    }

    public final boolean A08(C93314oJ r5, C624134x r6) {
        AnonymousClass679 conversationRowCustomizer = this.A0N.getConversationRowCustomizer();
        int AzN = conversationRowCustomizer.AzN();
        if (r5.A00 == AzN || !conversationRowCustomizer.BoL()) {
            HashSet hashSet = this.A0Z;
            AnonymousClass2z0 r1 = r6.A1J;
            if (hashSet.contains(r1) || this.A0W.contains(r1) || this.A0Y.contains(r1) || this.A0X.contains(r1) || this.A07 != null || r5.A04 != this.A02 || (r6 instanceof C30801n8)) {
                return true;
            }
            return false;
        }
        r5.A00 = AzN;
        return true;
    }

    public final boolean A09(C624134x r7) {
        byte b;
        AnonymousClass58L A002 = this.A0L.A00(r7);
        if (A002 != AnonymousClass58L.NONE) {
            C162457s7.A0J(A002, 0);
            if ((A002 == AnonymousClass58L.AGENT_LINKS || r7.A1M <= this.A06) && r7.A1L > 0 && (((b = r7.A1I) != 20 || r7.A0w() == null) && !AnonymousClass353.A04(r7) && r7.A0c == null)) {
                if (b != 20) {
                    return true;
                }
                C56612sH r3 = this.A0P;
                if (C627636p.A07(this.A0K, r3, this.A0R, this.A0T, r7) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0A(C624134x r12, C624134x r13, int i, int i2) {
        boolean z;
        C624134x A0w;
        C624134x A0w2;
        C95814uZ A0n;
        long j = r12.A0K;
        long j2 = r13.A0K;
        if (Math.abs(j - j2) <= 610000 && C107175ap.A05(j, j2) && r12.A1s(1) == r13.A1s(1) && (z = r12.A1J.A02) == r13.A1J.A02 && ((z || (A0n = r12.A0n()) == null || A0n.equals(r13.A0n())) && AnonymousClass001.A1Y(i, A01()) == AnonymousClass001.A1Y(i2, A01()))) {
            AnonymousClass5MS r0 = this.A0L;
            if (r0.A00(r12) == r0.A00(r13) && ((A0w = r12.A0w()) == (A0w2 = r13.A0w()) || !(A0w == null || A0w2 == null || !C86664Kz.A1X(A0w2, A0w.A1J)))) {
                C53042mS A0z = r12.A0z();
                C53042mS A0z2 = r13.A0z();
                if (A0z == null) {
                    if (A0z2 == null) {
                        return true;
                    }
                    return false;
                } else if (A0z2 == null || !A0z.A01.equals(A0z2.A01)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw AnonymousClass001.A0e("should not be called, getView is defined");
    }

    public int getCount() {
        int i = 0;
        if (!this.A0F || getCursor() == null) {
            Log.d("conversation/adapter/getcount/nocursor 0");
        } else if (!this.A0H) {
            int size = this.A01 + this.A08.size();
            if (this.A05 > 0) {
                i = 1;
            }
            return size + i;
        }
        return 0;
    }

    public int getItemViewType(int i) {
        if (!this.A0F) {
            return -1;
        }
        if (this.A05 > 0 && i == A01()) {
            return 18;
        }
        C624134x A052 = getItem(i);
        if (A052 == null) {
            return -1;
        }
        C105165Tv r2 = this.A0M;
        AnonymousClass58K A042 = A04(A052, i);
        if (A042 == AnonymousClass58K.NONE) {
            return r2.A00(A052);
        }
        if (A042 != AnonymousClass58K.TOP) {
            return 34;
        }
        int ordinal = r2.A08.A00(A052).ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 107;
            }
            if (A052.A1J.A02) {
                return 32;
            }
            return 33;
        } else if (A052.A1J.A02) {
            return 41;
        } else {
            return 42;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x036d, code lost:
        if (r0.A00 == 1) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x049c, code lost:
        if (r7 != false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019a, code lost:
        if (r1.A09.A0F == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c2, code lost:
        if (X.AnonymousClass001.A1a(r4.getFMessage(), r6.getClass()) != false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0465  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r2 = r20
            r5 = r18
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0018
            X.5ND r0 = r5.A0A
            if (r0 == 0) goto L_0x0018
            X.5JR r0 = r5.A0B
            if (r0 == 0) goto L_0x0018
            X.C626936e.A01()
            boolean r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r17 = "adapter_row"
            if (r0 == 0) goto L_0x0029
            X.5ND r0 = r5.A0A
            X.C626936e.A06(r0)
            X.316 r1 = r0.A01
            r0 = r17
            r1.A0A(r0)
        L_0x0029:
            int r0 = r5.A01()
            r10 = 2
            r7 = 0
            r6 = 1
            r9 = r19
            r3 = r21
            if (r9 != r0) goto L_0x0095
            if (r20 != 0) goto L_0x0043
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r3)
            r0 = 2131624676(0x7f0e02e4, float:1.8876538E38)
            android.view.View r2 = r1.inflate(r0, r3, r7)
        L_0x0043:
            r0 = 2131434487(0x7f0b1bf7, float:1.849079E38)
            android.widget.TextView r9 = X.C18300x5.A0G(r2, r0)
            int r0 = r5.A03
            int r4 = r5.A04
            if (r0 <= 0) goto L_0x0082
            android.content.res.Resources r3 = r2.getResources()
            r1 = 2131755378(0x7f100172, float:1.9141634E38)
            int r0 = r5.A03
            if (r4 <= 0) goto L_0x008d
            java.lang.String r8 = X.AnonymousClass0x2.A0Y(r3, r0, r7, r1)
            android.content.res.Resources r3 = r2.getResources()
            r1 = 2131755194(0x7f1000ba, float:1.914126E38)
            int r0 = r5.A04
            java.lang.String r4 = X.AnonymousClass0x2.A0Y(r3, r0, r7, r1)
            android.content.Context r3 = r2.getContext()
            r1 = 2131894627(0x7f122163, float:1.9424064E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r7] = r8
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r4, r0, r6, r1)
        L_0x007b:
            r9.setText(r0)
            r9.setFocusable(r6)
            return r2
        L_0x0082:
            if (r4 <= 0) goto L_0x0092
            android.content.res.Resources r3 = r2.getResources()
            r1 = 2131755194(0x7f1000ba, float:1.914126E38)
            int r0 = r5.A04
        L_0x008d:
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r3, r0, r7, r1)
            goto L_0x007b
        L_0x0092:
            java.lang.String r0 = ""
            goto L_0x007b
        L_0x0095:
            X.34x r6 = r5.getItem(r9)
            if (r6 != 0) goto L_0x00ad
            java.lang.String r0 = "Conversation/isMessageValid message was null, already deleted?"
        L_0x009d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Context r0 = r3.getContext()
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            X.C86624Kv.A0v(r2, r7)
            return r2
        L_0x00ad:
            byte r10 = r6.A1I
            r0 = 36
            if (r10 != r0) goto L_0x00bc
            boolean r0 = X.AnonymousClass2z0.A0D(r6)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "Conversation/isMessageValid message was malicious."
            goto L_0x009d
        L_0x00bc:
            boolean r0 = r6 instanceof X.C31341o8
            if (r0 == 0) goto L_0x00cb
            r1 = r6
            X.1o8 r1 = (X.C31341o8) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 == 0) goto L_0x01c6
            com.whatsapp.jid.UserJid r0 = r1.A00
            if (r0 == 0) goto L_0x01c6
        L_0x00cb:
            X.C626936e.A06(r6)
            X.58K r8 = r5.A04(r6, r9)
            boolean r0 = r2 instanceof X.C93314oJ
            if (r0 == 0) goto L_0x00ef
            r4 = r2
            X.4oJ r4 = (X.C93314oJ) r4
            X.34x r0 = r4.getFMessage()
            byte r0 = r0.A1I
            if (r0 != r10) goto L_0x00ef
            boolean r0 = r6 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0179
            boolean r1 = X.C87094Nz.A0g(r4)
            X.2z0 r0 = r6.A1J
            boolean r0 = r0.A02
            if (r1 == r0) goto L_0x0179
        L_0x00ef:
            X.5Tv r4 = r5.A0M
            android.content.Context r3 = r3.getContext()
            X.677 r1 = r5.A0N
            X.58K r0 = X.AnonymousClass58K.NONE
            if (r8 != r0) goto L_0x0174
            X.4oJ r4 = r4.A03(r3, r1, r6)
        L_0x00ff:
            X.0WH r1 = r4.A0O
            if (r1 != 0) goto L_0x010b
            r0 = 7
            X.67a r1 = new X.67a
            r1.<init>(r4, r0)
            r4.A0O = r1
        L_0x010b:
            X.C06560Yg.A0O(r4, r1)
            X.1VX r1 = r4.A0O
            r0 = 3419(0xd5b, float:4.791E-42)
            r1.A0X(r0)
            boolean r0 = r4 instanceof X.C133486hS
            if (r0 == 0) goto L_0x01cf
            r13 = r4
            X.6hS r13 = (X.C133486hS) r13
            int r12 = r13.getMaxAlbumSize()
            int r0 = r13.getMinAlbumSize()
            java.util.ArrayList r11 = X.AnonymousClass002.A0I(r0)
            r11.add(r6)
            boolean r10 = r5.A08(r4, r6)
            int r3 = r19 + 1
            r1 = r6
        L_0x0132:
            int r0 = r5.getCount()
            if (r3 >= r0) goto L_0x01ca
            int r0 = r11.size()
            if (r0 >= r12) goto L_0x01ca
            X.34x r2 = r5.getItem(r3)
            if (r2 == 0) goto L_0x01ca
            int r0 = r3 + -1
            boolean r0 = r5.A0A(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r5.A09(r2)
            if (r0 == 0) goto L_0x01ca
            r11.add(r2)
            boolean r0 = r5.A08(r4, r2)
            r10 = r10 | r0
            java.util.HashSet r0 = r5.A0X
            X.2z0 r1 = r2.A1J
            r0.remove(r1)
            java.util.HashSet r0 = r5.A0Z
            r0.remove(r1)
            java.util.HashSet r0 = r5.A0W
            r0.remove(r1)
            java.util.HashSet r0 = r5.A0Y
            r0.remove(r1)
            int r3 = r3 + 1
            r1 = r2
            goto L_0x0132
        L_0x0174:
            X.4oJ r4 = r4.A02(r3, r8, r1, r6)
            goto L_0x00ff
        L_0x0179:
            boolean r0 = r6 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0187
            X.34x r0 = r4.getFMessage()
            boolean r0 = r0 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0187
            goto L_0x00ef
        L_0x0187:
            boolean r0 = r6 instanceof X.C31021nc
            if (r0 == 0) goto L_0x019e
            boolean r0 = r4 instanceof X.C93124nw
            if (r0 == 0) goto L_0x019e
            r1 = r4
            X.4nw r1 = (X.C93124nw) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00ef
            X.3ZH r0 = r1.A09
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x019e
            goto L_0x00ef
        L_0x019e:
            boolean r0 = r6 instanceof X.C30721mu
            if (r0 == 0) goto L_0x01b6
            X.34x r0 = r4.getFMessage()
            boolean r0 = r0 instanceof X.C30721mu
            if (r0 == 0) goto L_0x01b6
            X.34x r0 = r4.getFMessage()
            X.2mS r0 = r0.A0z()
            if (r0 == 0) goto L_0x01b6
            goto L_0x00ef
        L_0x01b6:
            java.lang.Class r1 = r6.getClass()
            X.34x r0 = r4.getFMessage()
            boolean r0 = X.AnonymousClass001.A1a(r0, r1)
            if (r0 == 0) goto L_0x00ef
            goto L_0x00ff
        L_0x01c6:
            java.lang.String r0 = "Conversation/isMessageValid number change message missing JID(s)."
            goto L_0x009d
        L_0x01ca:
            r13.A24(r11, r10)
            goto L_0x02fc
        L_0x01cf:
            boolean r0 = r4 instanceof X.C93084ns
            if (r0 == 0) goto L_0x028f
            boolean r0 = r6 instanceof X.C30481mW
            if (r0 == 0) goto L_0x028f
            r14 = r4
            X.4ns r14 = (X.C93084ns) r14
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            boolean r12 = r5.A08(r4, r6)
            r11 = r6
            X.5Yz r10 = r5.A0O
            boolean r0 = X.C106435Yz.A00(r6)
            if (r0 == 0) goto L_0x01f8
            X.2nF r0 = r6.A0r()
            if (r0 == 0) goto L_0x01f8
            X.21g r0 = r0.A00
            if (r0 == 0) goto L_0x01f8
            r13.add(r6)
        L_0x01f8:
            int r3 = r19 + 1
            r2 = r6
        L_0x01fb:
            int r0 = r5.getCount()
            if (r3 >= r0) goto L_0x0243
            int r1 = r13.size()
            r0 = 10
            if (r1 >= r0) goto L_0x0243
            X.34x r1 = r5.getItem(r3)
            if (r1 == 0) goto L_0x0243
            boolean r0 = r10.A01(r11, r1)
            if (r0 == 0) goto L_0x0243
            r11 = r1
            boolean r0 = X.C106435Yz.A00(r1)
            if (r0 == 0) goto L_0x0231
            X.2nF r0 = r1.A0r()
            if (r0 == 0) goto L_0x0231
            X.21g r0 = r0.A00
            if (r0 == 0) goto L_0x0231
            r13.add(r1)
        L_0x0229:
            boolean r0 = r5.A08(r4, r1)
            r12 = r12 | r0
            int r3 = r3 + 1
            goto L_0x01fb
        L_0x0231:
            boolean r0 = X.C106435Yz.A00(r1)
            if (r0 == 0) goto L_0x0229
            X.2nF r0 = r1.A0r()
            if (r0 == 0) goto L_0x0241
            X.21g r0 = r0.A00
            if (r0 != 0) goto L_0x0229
        L_0x0241:
            r2 = r1
            goto L_0x0229
        L_0x0243:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowBotPlugin/setMessages needsRefresh="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " currentMessage="
            r1.append(r0)
            X.34x r0 = r14.A0S
            r1.append(r0)
            java.lang.String r0 = " originalBotMessage="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " albumMessages="
            X.C18260x0.A1P(r1, r0, r13)
            X.34x r0 = r14.A0S
            r11 = 0
            boolean r16 = X.C18300x5.A1W(r0, r2)
            if (r12 != 0) goto L_0x02ba
            java.util.ArrayList r15 = r14.A01
            int r1 = r15.size()
            int r0 = r13.size()
            if (r1 != r0) goto L_0x02b9
            int r10 = r13.size()
            r3 = 0
        L_0x0280:
            if (r3 >= r10) goto L_0x02ba
            java.lang.Object r1 = r15.get(r3)
            java.lang.Object r0 = r13.get(r3)
            if (r1 != r0) goto L_0x02b9
            int r3 = r3 + 1
            goto L_0x0280
        L_0x028f:
            boolean r0 = r4 instanceof X.C93144ny
            if (r0 == 0) goto L_0x02a2
            r1 = r4
            X.4ny r1 = (X.C93144ny) r1
            X.58K r0 = X.AnonymousClass58K.BOTTOM
            boolean r0 = X.AnonymousClass000.A1Y(r8, r0)
            r1.A00 = r0
            r4.A1q(r6, r7)
            goto L_0x02fc
        L_0x02a2:
            if (r20 != 0) goto L_0x02a8
            boolean r0 = r4.A2K
            if (r0 == 0) goto L_0x02fc
        L_0x02a8:
            boolean r0 = r5.A08(r4, r6)
            r4.A1q(r6, r0)
            java.util.HashSet r1 = r5.A0X
            X.2z0 r0 = r6.A1J
            r1.remove(r0)
            r4.A2K = r7
            goto L_0x02fc
        L_0x02b9:
            r12 = 1
        L_0x02ba:
            if (r16 != 0) goto L_0x02be
            if (r12 == 0) goto L_0x02f9
        L_0x02be:
            r14.A01 = r13
            X.4mV r3 = r14.A05
            r1 = 9
            X.4IU r0 = new X.4IU
            r0.<init>(r1)
            java.util.List r0 = X.C73723fy.A0L(r13, r0)
            r3.A01 = r0
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x02ed
            java.lang.Object r0 = r13.get(r7)
            X.34x r0 = (X.C624134x) r0
            if (r0 == 0) goto L_0x04b0
            X.2nF r0 = r0.A0r()
            if (r0 == 0) goto L_0x04ad
            X.21g r1 = r0.A00
        L_0x02e5:
            X.21g r0 = X.C371821g.REELS
            if (r1 != r0) goto L_0x04b0
            X.57n r0 = X.C996657n.REEL
        L_0x02eb:
            r3.A00 = r0
        L_0x02ed:
            if (r16 == 0) goto L_0x02f4
            com.whatsapp.conversation.carousel.ConversationCarousel r0 = r14.A04
            r0.A0Z(r7)
        L_0x02f4:
            if (r12 != 0) goto L_0x02f8
            if (r16 == 0) goto L_0x02f9
        L_0x02f8:
            r11 = 1
        L_0x02f9:
            r14.A1q(r2, r11)
        L_0x02fc:
            int r0 = r5.A02
            r4.A04 = r0
            java.util.HashSet r1 = r5.A0Z
            X.2z0 r10 = r6.A1J
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x0320
            r1.remove(r10)
            X.07r r0 = r5.A0J
            X.08A r0 = r0.A06
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0320
            boolean r0 = r6.A1F
            r4.A1R(r7, r0)
        L_0x0320:
            java.util.HashSet r1 = r5.A0W
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x0349
            r1.remove(r10)
            X.07r r0 = r5.A0J
            X.08A r0 = r0.A06
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0349
            boolean r0 = r4 instanceof X.C93294oH
            if (r0 != 0) goto L_0x0349
            int r0 = r6.A0j()
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r4.A1R(r1, r0)
        L_0x0349:
            java.util.HashSet r1 = r5.A0Y
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x0373
            r1.remove(r10)
            X.07r r0 = r5.A0J
            X.08A r0 = r0.A06
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0373
            boolean r0 = r4 instanceof X.C93294oH
            if (r0 != 0) goto L_0x0373
            X.1me r0 = r6.A1T
            if (r0 == 0) goto L_0x04aa
            int r0 = r0.A00
            r1 = 1
            if (r0 != r1) goto L_0x04aa
        L_0x036f:
            r0 = 2
            r4.A1R(r0, r1)
        L_0x0373:
            X.2z0 r0 = r5.A0D
            r12 = 0
            if (r0 == 0) goto L_0x0383
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0383
            r5.A0D = r12
            r4.A1N()
        L_0x0383:
            java.util.Set r3 = r5.A0b
            java.util.Iterator r1 = r3.iterator()
        L_0x0389:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03aa
            java.lang.Object r2 = r1.next()
            X.2z0 r2 = (X.AnonymousClass2z0) r2
            boolean r0 = r4.A21(r2)
            if (r0 == 0) goto L_0x0389
            r3.remove(r2)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            X.6AF r0 = new X.6AF
            r0.<init>(r2, r4, r5, r7)
            r1.addOnPreDrawListener(r0)
        L_0x03aa:
            X.58K r11 = X.AnonymousClass58K.NONE
            if (r8 == r11) goto L_0x03b2
            X.58K r0 = X.AnonymousClass58K.TOP
            if (r8 != r0) goto L_0x04a7
        L_0x03b2:
            r1 = 1
            if (r19 == 0) goto L_0x04a4
            int r0 = r19 + -1
            X.34x r12 = r5.getItem(r0)
            if (r12 == 0) goto L_0x04a4
            X.34x r0 = r5.A0C
            if (r12 != r0) goto L_0x03cb
            if (r9 <= r1) goto L_0x03cb
            int r0 = r19 + -2
            X.34x r0 = r5.getItem(r0)
            if (r0 != 0) goto L_0x03cc
        L_0x03cb:
            r0 = r12
        L_0x03cc:
            long r2 = r0.A0K
            long r0 = r6.A0K
            boolean r1 = X.C107175ap.A05(r2, r0)
            r0 = r1 ^ 1
            r4.A1s(r0)
        L_0x03d9:
            r13 = -1
            if (r8 != r11) goto L_0x04a0
            X.677 r0 = r5.A0N
            X.679 r8 = r0.getConversationRowCustomizer()
            boolean r0 = r8.Bo3()
            if (r0 != 0) goto L_0x049e
            r11 = 6
            if (r1 == 0) goto L_0x0499
            if (r12 == 0) goto L_0x0499
            X.2z0 r0 = r12.A1J
            boolean r0 = r0.A02
            boolean r1 = r10.A02
            if (r0 != r1) goto L_0x0499
            int r0 = X.C93324oK.A0u(r8, r12)
            if (r0 == 0) goto L_0x0499
            int r0 = r6.A0D
            if (r0 == r11) goto L_0x0499
            int r0 = r12.A0D
            if (r0 == r11) goto L_0x0499
            if (r1 != 0) goto L_0x0415
            X.4uZ r1 = r6.A0n()
            if (r1 == 0) goto L_0x0415
            X.4uZ r0 = r12.A0n()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0499
        L_0x0415:
            r12 = 1
        L_0x0416:
            int r0 = r19 + 1
            X.34x r9 = r5.getItem(r0)
            if (r9 == 0) goto L_0x0451
            long r2 = r9.A0K
            long r0 = r6.A0K
            boolean r0 = X.C107175ap.A05(r2, r0)
            if (r0 == 0) goto L_0x0451
            X.2z0 r0 = r9.A1J
            boolean r0 = r0.A02
            boolean r1 = r10.A02
            if (r0 != r1) goto L_0x0451
            int r0 = X.C93324oK.A0u(r8, r9)
            if (r0 == 0) goto L_0x0451
            int r0 = r6.A0D
            if (r0 == r11) goto L_0x0451
            int r0 = r9.A0D
            if (r0 == r11) goto L_0x0451
            if (r1 != 0) goto L_0x0450
            X.4uZ r1 = r6.A0n()
            if (r1 == 0) goto L_0x0450
            X.4uZ r0 = r9.A0n()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0451
        L_0x0450:
            r7 = 1
        L_0x0451:
            if (r12 == 0) goto L_0x0455
            if (r7 != 0) goto L_0x0497
        L_0x0455:
            int r0 = X.C93324oK.A0u(r8, r6)
            if (r0 == 0) goto L_0x0497
            if (r12 == 0) goto L_0x049c
            r0 = 3
        L_0x045e:
            r4.A1O(r0)
        L_0x0461:
            X.5JR r1 = r5.A0B
            if (r1 == 0) goto L_0x0496
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0483
            X.5ND r0 = r5.A0A
            if (r0 == 0) goto L_0x0483
            X.C626936e.A01()
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0483
            X.5ND r0 = r5.A0A
            X.C626936e.A06(r0)
            X.316 r1 = r0.A01
            r0 = r17
            r1.A09(r0)
            r0 = 1
            r5.A0G = r0
        L_0x0483:
            X.5JR r1 = r5.A0B
            X.C626936e.A01()
            X.C626936e.A01()
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0496
            X.8s5 r1 = r1.A02
            X.5RR r0 = r4.A1n
            r0.A02(r1)
        L_0x0496:
            return r4
        L_0x0497:
            r0 = 2
            goto L_0x045e
        L_0x0499:
            r12 = 0
            goto L_0x0416
        L_0x049c:
            if (r7 == 0) goto L_0x04a0
        L_0x049e:
            r0 = 1
            goto L_0x045e
        L_0x04a0:
            r4.A1O(r13)
            goto L_0x0461
        L_0x04a4:
            r4.A1s(r1)
        L_0x04a7:
            r1 = 0
            goto L_0x03d9
        L_0x04aa:
            r1 = 0
            goto L_0x036f
        L_0x04ad:
            r1 = 0
            goto L_0x02e5
        L_0x04b0:
            X.57n r0 = X.C996657n.LINK_PREVIEW
            goto L_0x02eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87234On.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return (AnonymousClass001.A1W(this.A05) ? 1 : 0) + true;
    }

    public boolean hasStableIds() {
        return true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw AnonymousClass001.A0e("should not be called, getView is defined");
    }

    public void onContentChanged() {
    }

    public static void A00(ConversationListView conversationListView, C113245l7 r2) {
        conversationListView.getConversationCursorAdapter().A02++;
        r2.A2f.A03();
    }

    public int A03(C624134x r4) {
        int i;
        if (getCursor() != null && !this.A0H) {
            SparseArray sparseArray = this.A0I;
            int indexOfValue = sparseArray.indexOfValue(r4);
            if (indexOfValue >= 0) {
                i = sparseArray.keyAt(indexOfValue);
            } else {
                int i2 = 0;
                while (i2 < this.A08.size()) {
                    if (r4.equals(this.A08.get(i2))) {
                        i = i2 + this.A01;
                    } else {
                        i2++;
                    }
                }
            }
            if (i >= A01()) {
                return i + 1;
            }
            return i;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r1.A01(r9, r0) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b2, code lost:
        if (r5 == 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        if (A09(r1) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d2, code lost:
        if (r5 == 1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d9, code lost:
        return X.AnonymousClass58K.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass58K A04(X.C624134x r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.A09(r9)
            if (r0 == 0) goto L_0x00cc
            X.5MS r0 = r8.A0L
            X.58L r0 = r0.A00(r9)
            int r0 = r0.ordinal()
            r7 = 3
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == r4) goto L_0x005c
            if (r0 == r7) goto L_0x003d
            if (r0 != r6) goto L_0x00cc
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x00cc
            int r3 = r10 + -1
            r2 = r9
        L_0x0021:
            if (r3 < 0) goto L_0x00b5
            X.34x r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x00b5
            int r0 = r3 + 1
            boolean r0 = r8.A0A(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x00b5
            int r5 = r5 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0021
        L_0x003d:
            int r0 = r10 + -1
            X.34x r0 = r8.getItem(r0)
            if (r0 == 0) goto L_0x00cf
            X.5Yz r1 = r8.A0O
            boolean r0 = r1.A01(r0, r9)
            if (r0 == 0) goto L_0x00cf
            int r0 = r10 + 1
            X.34x r0 = r8.getItem(r0)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r1.A01(r9, r0)
            if (r0 != 0) goto L_0x00d7
            goto L_0x00d4
        L_0x005c:
            int r3 = r10 + -1
            r2 = r9
            r4 = 0
        L_0x0060:
            if (r3 < 0) goto L_0x007e
            if (r4 >= r7) goto L_0x007e
            X.34x r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x007e
            int r0 = r3 + 1
            boolean r0 = r8.A0A(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x007e
            int r4 = r4 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x0060
        L_0x007e:
            int r3 = r10 + 1
        L_0x0080:
            int r0 = r8.getCount()
            r2 = 102(0x66, float:1.43E-43)
            if (r3 >= r0) goto L_0x00a4
            if (r5 >= r2) goto L_0x00a4
            X.34x r1 = r8.getItem(r3)
            if (r1 == 0) goto L_0x00a4
            int r0 = r3 + -1
            boolean r0 = r8.A0A(r1, r9, r3, r0)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x00a4
            int r5 = r5 + 1
            int r3 = r3 + 1
            r9 = r1
            goto L_0x0080
        L_0x00a4:
            int r1 = r4 + 1
            int r1 = r1 + r5
            r0 = 4
            if (r1 < r0) goto L_0x00cc
            if (r5 >= r2) goto L_0x00cc
            r0 = 101(0x65, float:1.42E-43)
            if (r5 == r0) goto L_0x00cf
            if (r4 == 0) goto L_0x00cf
            if (r5 != 0) goto L_0x00d7
            goto L_0x00d4
        L_0x00b5:
            int r5 = r5 % r6
            if (r5 != 0) goto L_0x00d2
            int r0 = r10 + 1
            X.34x r1 = r8.getItem(r0)
            if (r1 == 0) goto L_0x00cc
            boolean r0 = r8.A0A(r1, r9, r0, r10)
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r8.A09(r1)
            if (r0 != 0) goto L_0x00cf
        L_0x00cc:
            X.58K r0 = X.AnonymousClass58K.NONE
            return r0
        L_0x00cf:
            X.58K r0 = X.AnonymousClass58K.TOP
            return r0
        L_0x00d2:
            if (r5 != r4) goto L_0x00d7
        L_0x00d4:
            X.58K r0 = X.AnonymousClass58K.BOTTOM
            return r0
        L_0x00d7:
            X.58K r0 = X.AnonymousClass58K.BODY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87234On.A04(X.34x, int):X.58K");
    }

    public Cursor getCursor() {
        Cursor cursor = super.getCursor();
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    public long getItemId(int i) {
        long j;
        C624134x A052 = getItem(i);
        if (A052 == null) {
            return 0;
        }
        if (A052.A1L == 0) {
            j = (long) A052.A1J.hashCode();
        } else {
            j = A052.A1L;
        }
        return (j & 4294967295L) | (((long) A052.A1I) << 32);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0F = false;
    }
}
