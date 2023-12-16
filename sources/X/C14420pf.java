package X;

import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0pf  reason: invalid class name and case insensitive filesystem */
public final class C14420pf extends C829045j implements AnonymousClass4GS {
    public final /* synthetic */ C153427bI $bloksContext;
    public final /* synthetic */ AnonymousClass84O $component;
    public final /* synthetic */ AnonymousClass7S1 $resolveContext;

    public final C180518lC A00(BloksEditText bloksEditText, Object obj) {
        C162457s7.A0J(bloksEditText, 1);
        C162457s7.A0J(obj, 2);
        C04080Ms A02 = AnonymousClass0YO.A02(bloksEditText, this.$resolveContext, this.$bloksContext, this.$component, obj);
        if (this.$component.A0W(63, false)) {
            float textSize = bloksEditText.getTextSize();
            if (A02.A01 != textSize) {
                A02.A01 = textSize;
                this.$resolveContext.A00().A01(new C147917Gf(new C18050wf(A02, 1), this.$component.A0C()));
            }
        }
        return new C03010Im(bloksEditText, this.$bloksContext, this.$component, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14420pf(AnonymousClass7S1 r2, C153427bI r3, AnonymousClass84O r4) {
        super(3);
        this.$bloksContext = r3;
        this.$component = r4;
        this.$resolveContext = r2;
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        return A00((BloksEditText) obj2, obj3);
    }
}
