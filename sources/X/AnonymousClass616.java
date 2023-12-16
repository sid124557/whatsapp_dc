package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.616  reason: invalid class name */
public final class AnonymousClass616 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92284mO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass616(C92284mO r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104935Sx r7 = (C104935Sx) obj;
        C92284mO r5 = this.this$0;
        C162457s7.A0H(r7);
        Menu menu = r5.A00;
        if (menu == null) {
            throw C18270x1.A0S("menu");
        }
        MenuItem findItem = menu.findItem(60);
        if (findItem != null && findItem.isVisible()) {
            r5.A01.invalidateOptionsMenu();
        }
        if (r7.A05) {
            C009707r r4 = r5.A01;
            AnonymousClass0x9.A1L(r4);
            C19340zH A00 = AnonymousClass5V0.A00(r4);
            A00.A0U(r7.A01);
            A00.A0T(r7.A00);
            A00.A0d(r4, new C100385As(r7, 11, r5), R.string.f11nameremoved);
            A00.A0c(r4, new AnonymousClass5BX(1), R.string.f11nameremoved);
            C18280x3.A0q(A00);
        } else {
            int i = r7.A00;
            C009707r r0 = r5.A01;
            AnonymousClass0x9.A1L(r0);
            ((C89654ea) r0).Bot(i);
        }
        return C59022wD.A00;
    }
}
