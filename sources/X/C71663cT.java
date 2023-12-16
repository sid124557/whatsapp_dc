package X;

import com.whatsapp.R;
import com.whatsapp.conversation.ConversationListView;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.3cT  reason: invalid class name and case insensitive filesystem */
public class C71663cT implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C71663cT(C621033m r2, C624134x r3, int i) {
        this.A04 = 2;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = true;
        this.A00 = i;
    }

    public static void A00(AnonymousClass6NK r2) {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        synchronized (r2) {
            runnableFuture = r2.A01;
        }
        if (runnableFuture == null || !runnableFuture.isCancelled()) {
            synchronized (r2) {
                runnableFuture2 = r2.A01;
            }
            if (runnableFuture2 != null && !runnableFuture2.isDone() && r2.A02.get() == -1) {
                r2.A00();
            }
        }
    }

    public void run() {
        switch (this.A04) {
            case 0:
                if (this.A03) {
                    List list = (List) this.A02;
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0 && !((C146467Aj) this.A01).A00.get()) {
                            A00(((C151627Vn) list.get(size)).A00);
                        } else {
                            return;
                        }
                    }
                } else {
                    int i = 0;
                    while (true) {
                        List list2 = (List) this.A02;
                        if (i < list2.size() && !((C146467Aj) this.A01).A00.get()) {
                            A00(((C151627Vn) list2.get(i)).A00);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                ((ConversationListView) this.A01).A08((C624134x) this.A02, -1, true);
                return;
            case 2:
                ((C621033m) this.A01).A0R((C624134x) this.A02, this.A00, true, false);
                return;
            case 3:
                C56232re r2 = (C56232re) this.A01;
                C624134x r4 = (C624134x) this.A02;
                int i2 = this.A00;
                boolean z = this.A03;
                Set A012 = r2.A08.A01(r4.A1J);
                r2.A03.A0L(r4, i2, 1, C627336j.A00(r2.A00, A012), A012.size(), z);
                return;
            default:
                C620733j r11 = (C620733j) this.A01;
                int i3 = this.A00;
                boolean z2 = this.A03;
                C69263Wi r9 = (C69263Wi) this.A02;
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[1];
                Locale A022 = C620733j.A02(r11);
                Object[] objArr3 = new Object[1];
                char A1Y = C18300x5.A1Y(objArr3, i3);
                objArr2[A1Y] = String.format(A022, "%d", objArr3);
                objArr[A1Y] = r11.A0K(objArr2, 283, (long) i3);
                String A0E = r11.A0E(R.string.f11nameremoved, objArr);
                if (z2) {
                    r9.A0P(A0E, 1);
                    return;
                } else {
                    r9.A0W(A0E, 1);
                    return;
                }
        }
    }

    public C71663cT(Object obj, Object obj2, int i, int i2, boolean z) {
        this.A04 = i2;
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    public C71663cT(ConversationListView conversationListView, C624134x r4) {
        this.A04 = 1;
        this.A01 = conversationListView;
        this.A02 = r4;
        this.A00 = -1;
        this.A03 = true;
    }
}
