package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.4RF  reason: invalid class name */
public abstract class AnonymousClass4RF extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.components.MaxHeightLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView
            if (r0 == 0) goto L_0x0029
            r2 = r3
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r2 = (com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView) r2
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r2.A06 = r0
            java.lang.Object r0 = r2.generatedComponent()
            X.3Db r1 = X.C88864av.A00(r0)
            X.33m r0 = X.C64333Db.A08(r1)
            r2.A00 = r0
            X.2oU r0 = X.C64333Db.A2q(r1)
            r2.A01 = r0
            X.33j r0 = X.C64333Db.A2t(r1)
            r2.A02 = r0
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r3 instanceof com.whatsapp.components.MaxHeightLinearLayout
            if (r0 == 0) goto L_0x003b
            r1 = r3
            com.whatsapp.components.MaxHeightLinearLayout r1 = (com.whatsapp.components.MaxHeightLinearLayout) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r1.A01 = r0
        L_0x0037:
            r1.generatedComponent()
            return
        L_0x003b:
            boolean r0 = r3 instanceof com.whatsapp.BoundedLinearLayout
            if (r0 == 0) goto L_0x004a
            r1 = r3
            com.whatsapp.BoundedLinearLayout r1 = (com.whatsapp.BoundedLinearLayout) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r1.A02 = r0
            goto L_0x0037
        L_0x004a:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r3.A01 = r0
            r3.generatedComponent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RF.A01():void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4RF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public AnonymousClass4RF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public AnonymousClass4RF(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public AnonymousClass4RF(Context context) {
        super(context);
        A01();
    }
}
