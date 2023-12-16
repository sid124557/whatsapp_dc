package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.ConversationFragment;

/* renamed from: X.6By  reason: invalid class name and case insensitive filesystem */
public class C124356By implements C834048g, AnonymousClass4GP {
    public Object A00;
    public Object A01;
    public final int A02;

    public C124356By(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object invoke() {
        switch (this.A02) {
            case 0:
                C89154bn r4 = (C89154bn) this.A00;
                Intent intent = (Intent) this.A01;
                if (r4.A09.A0F() && r4.A00 != -1) {
                    Intent A08 = r4.A09.A08(r4, intent);
                    if (!A08.equals(intent)) {
                        r4.startActivity(A08);
                    } else {
                        r4.A76();
                        r4.A77();
                        r4.setIntent(intent);
                        C08270df supportFragmentManager = r4.getSupportFragmentManager();
                        if (!r4.isFinishing() && !supportFragmentManager.A0K && !supportFragmentManager.A0t()) {
                            ConversationFragment conversationFragment = new ConversationFragment();
                            C08240dc A0J = AnonymousClass0x2.A0J(r4);
                            A0J.A0D(conversationFragment, "com.whatsapp.HomeActivity.ConversationFragment", r4.A00);
                            A0J.A03();
                        }
                    }
                }
                return Boolean.TRUE;
            case 1:
                ((C113245l7) this.A00).A1o(((C103025Le) this.A01).A06);
                break;
            default:
                ((C66453Lm) this.A01).A0A((Activity) this.A00);
                break;
        }
        return C59022wD.A00;
    }
}
