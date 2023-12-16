package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6px  reason: invalid class name and case insensitive filesystem */
public class C138216px extends AnonymousClass5ZM {
    public final byte A00;
    public final AnonymousClass0QU A01;
    public final C55682qk A02;
    public final C56352rq A03;
    public final C66543Lv A04;
    public final AnonymousClass319 A05;
    public final AnonymousClass4FV A06;
    public final C106695a0 A07;
    public final File A08;
    public final WeakReference A09 = AnonymousClass0x9.A14((Object) null);

    public C138216px(C55682qk r4, C56352rq r5, C66543Lv r6, AnonymousClass319 r7, AnonymousClass4FV r8, C106695a0 r9, AnonymousClass4FS r10, File file, byte b) {
        this.A02 = r4;
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = b;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A08 = file;
        this.A01 = AnonymousClass5CH.A00(r10, 20000);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.d("mergetask/doinbackground/start");
        AnonymousClass7XL r8 = new AnonymousClass7XL();
        byte b = this.A00;
        r8.A00 = b;
        C55682qk r22 = this.A02;
        C106695a0 r21 = this.A07;
        C66543Lv r20 = this.A04;
        AnonymousClass319 r15 = this.A05;
        C56352rq r7 = this.A03;
        File file = this.A08;
        AnonymousClass0QU r14 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            r8.A0C = Long.valueOf(SystemClock.uptimeMillis());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList A0I = AnonymousClass002.A0I(r3);
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        A0I.add(new C148207Hm(file2));
                    }
                }
                C86614Ku.A1U(A0I, 42);
                r8.A07 += (long) A0I.size();
                r8.A0B = Long.valueOf(SystemClock.uptimeMillis());
                r8.A0A = Long.valueOf(SystemClock.uptimeMillis());
                C10550i7 r5 = new C10550i7();
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    C148207Hm r3 = (C148207Hm) it.next();
                    long j = r3.A00;
                    C148217Hn r2 = (C148217Hn) C10550i7.A00(r5, j);
                    if (r2 == null) {
                        r2 = new C148217Hn(j);
                        r5.A0A(j, r2);
                    }
                    File file3 = r3.A01;
                    List list = r2.A01;
                    boolean z = true;
                    if (!list.isEmpty() && file3.getName().compareTo(((File) list.get(AnonymousClass002.A04(list, 1))).getName()) < 0) {
                        z = false;
                    }
                    C626936e.A0C(z);
                    list.add(file3);
                }
                r14.A02();
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (int i = 0; i < r5.A01(); i++) {
                    C148217Hn r23 = (C148217Hn) r5.A04(i);
                    if (r23.A01.size() >= 2) {
                        A0s2.add(r23);
                        r8.A08 += (long) r23.A01.size();
                    }
                }
                r14.A02();
                C86614Ku.A1U(A0s2, 43);
                r14.A02();
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    C148217Hn r6 = (C148217Hn) it2.next();
                    HashMap A0t = AnonymousClass001.A0t();
                    List list2 = r6.A01;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            File file4 = (File) list2.get(size);
                            try {
                                r14.A02();
                                String A002 = C615131b.A00(r22, file4);
                                long j2 = r6.A00;
                                r8.A04++;
                                r8.A01 += j2;
                                File file5 = (File) A0t.get(A002);
                                if (file5 == null) {
                                    A0t.put(A002, file4);
                                } else {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("mediafilemerger/merge ");
                                    A0o.append(file4.getParentFile());
                                    A0o.append(": ");
                                    A0o.append(file4.getName());
                                    A0o.append(" to ");
                                    C18260x0.A1J(A0o, file5.getName());
                                    Collection<C30471mV> A0E = r15.A0E(r14, file4, A002);
                                    r14.A02();
                                    if (!A0E.isEmpty()) {
                                        ArrayList A0I2 = AnonymousClass002.A0I(A0E.size());
                                        r7.A04(file5, A0E.size(), true);
                                        for (C30471mV r32 : A0E) {
                                            AnonymousClass33C r0 = r32.A01;
                                            C626936e.A06(r0);
                                            r0.A0F = file5;
                                            r20.A0Y(r32);
                                            A0I2.add(new C148227Ho(file4, file5));
                                        }
                                        int size2 = A0E.size();
                                        if (r7.A07(file4)) {
                                            r7.A00(file4, size2);
                                        }
                                        StringBuilder A0o2 = AnonymousClass001.A0o();
                                        A0o2.append("mediafilemerger/merge/messages=");
                                        A0o2.append(A0E.size());
                                        C18260x0.A1P(A0o2, "; file=", file4);
                                        A0s.addAll(A0I2);
                                        long length = file5.length();
                                        r8.A06++;
                                        r8.A03 += length;
                                    } else {
                                        r21.A08(file4, b);
                                        boolean delete = file4.delete();
                                        StringBuilder A0o3 = AnonymousClass001.A0o();
                                        A0o3.append("mediafilemerger/merge/fileDeleted=");
                                        A0o3.append(delete);
                                        C18260x0.A1P(A0o3, "; file=", file4);
                                        long length2 = file5.length();
                                        r8.A05++;
                                        r8.A02 += length2;
                                    }
                                }
                            } catch (IOException e) {
                                Log.e("mediafilemerger/processfileswithsamelength", e);
                            }
                        }
                    }
                }
            }
        } catch (C13860nr e2) {
            Log.e("mediafilemerger/cancelled", e2);
        } catch (Throwable th) {
            SystemClock.uptimeMillis();
            throw th;
        }
        r8.A09 = Long.valueOf(SystemClock.uptimeMillis());
        Log.d("mergetask/doinbackground/done");
        return new C148237Hp(r8, A0s);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C148237Hp r3 = (C148237Hp) obj;
        C84134Bd r0 = (C84134Bd) this.A09.get();
        if (r0 != null) {
            r0.AwB(r3);
        }
        this.A06.BhD(r3.A00.A01());
    }
}
