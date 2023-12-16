package X;

import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2qN  reason: invalid class name and case insensitive filesystem */
public class C55452qN {
    public final C380625j A00;
    public final C26151bf A01;
    public final C26141be A02;
    public final C56092rP A03;
    public final C66693Mk A04;
    public final C56172rX A05;

    public C55452qN(C380625j r3, C56092rP r4, C66693Mk r5, C56172rX r6) {
        C26141be r1 = new C26141be();
        C26151bf r0 = new C26151bf();
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r0;
    }

    public int A00() {
        return this.A02.A02.size() + this.A01.A02.size();
    }

    public final void A01(int i) {
        C59182wU r0;
        C48082eJ r02;
        Object obj;
        C66693Mk r3 = this.A04;
        C56172rX r2 = this.A05;
        int i2 = r2.A02;
        if (i2 == 1 || i2 == 0) {
            r0 = r3.A00;
        } else {
            r0 = r3.A01;
        }
        Map map = r0.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            r02 = C59182wU.A01;
        } else {
            r02 = (C48082eJ) map.get(valueOf);
        }
        C56132rT r32 = r2.A04.A00;
        if (r32.A02 == r32.A06.A01) {
            Map map2 = r32.A04.A00;
            if (!map2.containsKey(valueOf)) {
                obj = C59182wU.A01;
            } else {
                obj = map2.get(valueOf);
            }
            C26151bf r4 = this.A01;
            Map map3 = r4.A00;
            if (!map3.containsKey(valueOf) && !r02.equals(obj)) {
                r4.A07(r02.A00, 0, i);
                map3.put(valueOf, r02);
                return;
            }
            return;
        }
        throw AnonymousClass002.A0G("No attribute value available for rotated buffers");
    }

    public void A02(AnonymousClass3ZG r5, int i) {
        C26141be r3 = this.A02;
        r3.A06();
        r3.A07(Integer.valueOf(i), 1, r5.code);
        r5.serialize(new C66643Mf(this));
        byte[] A012 = r3.A02.A01();
        int i2 = r3.A00;
        A012[i2] = (byte) (A012[i2] | 4);
    }

    public void A03(Integer num) {
        long j;
        Integer num2;
        C59182wU r0;
        this.A01.A06();
        C56172rX r3 = this.A05;
        int i = r3.A02;
        if (i == 2) {
            j = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()) * 3600;
            if (r3.A06()) {
                C56092rP r7 = this.A03;
                synchronized (r7) {
                    num2 = null;
                    if (num != null) {
                        if (num.intValue() != 0) {
                            HashMap hashMap = r7.A03;
                            if (hashMap == null) {
                                hashMap = r7.A03();
                                r7.A03 = hashMap;
                            }
                            AnonymousClass2RC r8 = (AnonymousClass2RC) hashMap.get(num);
                            if (r8 != null) {
                                long currentTimeMillis = System.currentTimeMillis() / 86400000;
                                if (currentTimeMillis > r8.A01) {
                                    r8.A00 = 0;
                                    r8.A01 = currentTimeMillis;
                                }
                                r8.A00++;
                                r7.A05(r8, num);
                                num2 = Integer.valueOf(r8.A00);
                            }
                        }
                    }
                }
            }
            num2 = null;
        } else {
            j = C18290x4.A08();
            if (r3.A06()) {
                AnonymousClass2SH r2 = r3.A06;
                int i2 = r2.A02 + 1;
                if (i2 <= 0) {
                    r2.A02 = 0;
                    r2.A04 = false;
                }
                if (r2.A04) {
                    r2.A02 = i2;
                    num2 = Integer.valueOf(i2);
                }
            }
            num2 = null;
        }
        C66693Mk r22 = this.A04;
        r22.A01(Long.valueOf(j), 47, i);
        r22.A01(num2, 3433, i);
        if (i == 1 || i == 0) {
            r0 = r22.A00;
        } else {
            r0 = r22.A01;
        }
        Iterator it = Collections.unmodifiableCollection(r0.A00.keySet()).iterator();
        while (it.hasNext()) {
            A01(C18280x3.A05(it));
        }
        C56132rT r23 = r3.A04.A00;
        if (r23.A02 == r23.A06.A01) {
            Iterator it2 = Collections.unmodifiableCollection(r23.A04.A00.keySet()).iterator();
            while (it2.hasNext()) {
                A01(C18280x3.A05(it2));
            }
            return;
        }
        throw AnonymousClass002.A0G("No attribute codes available for rotated buffers");
    }

    public void A04(byte[] bArr, int i, int i2) {
        C26141be r4 = this.A02;
        r4.A06();
        r4.A07(Integer.valueOf(i2), 1, i);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (wrap.position() < wrap.limit()) {
            try {
                AnonymousClass2O5 A032 = C625335l.A03(wrap);
                r4.A07(A032.A02, 2, A032.A00);
            } catch (C375523b e) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e);
            }
        }
        byte[] A012 = r4.A02.A01();
        int i3 = r4.A00;
        A012[i3] = (byte) (A012[i3] | 4);
    }
}
