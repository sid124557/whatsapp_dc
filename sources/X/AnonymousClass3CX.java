package X;

import android.view.KeyEvent;
import com.whatsapp.group.newgroup.NewGroup;

/* renamed from: X.3CX  reason: invalid class name */
public class AnonymousClass3CX implements AnonymousClass4CE {
    public final /* synthetic */ NewGroup A00;

    public AnonymousClass3CX(NewGroup newGroup) {
        this.A00 = newGroup;
    }

    public void BNH() {
        this.A00.A0B.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BRo(int[] iArr) {
        NewGroup newGroup = this.A00;
        newGroup.A0B.requestFocus();
        C107345b9.A09(newGroup.A0B, iArr, newGroup.A06.A03(C66663Mh.A1v));
    }
}
