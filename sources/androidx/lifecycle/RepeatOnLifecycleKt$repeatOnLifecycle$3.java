package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass0GH;
import X.AnonymousClass0O9;
import X.AnonymousClass34M;
import X.AnonymousClass46A;
import X.AnonymousClass46G;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C15110qn;
import X.C155227eU;
import X.C57682u2;
import X.C57702u4;
import X.C57722u6;
import X.C59022wD;
import X.C69903Yy;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public final /* synthetic */ AnonymousClass0GC $state;
    public final /* synthetic */ AnonymousClass0O9 $this_repeatOnLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public final C84814Du A0A(Object obj, C84814Du r8) {
            AnonymousClass0O9 r2 = r5;
            return new AnonymousClass1(r4, r2, r8, r7, r8);
        }

        public final Object A09(Object obj) {
            C69903Yy r9;
            C69903Yy r1;
            AnonymousClass0GH r6;
            Object A05 = C73883gE.A05();
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                AnonymousClass0O9 r4 = r5;
                if (((AnonymousClass08A) r4).A02 != AnonymousClass0GC.DESTROYED) {
                    r9 = new C69903Yy();
                    r1 = new C69903Yy();
                    AnonymousClass0GC r5 = r4;
                    AnonymousClass4C6 r11 = r8;
                    AnonymousClass4GR r8 = r7;
                    this.L$0 = r9;
                    this.L$1 = r1;
                    this.L$2 = r5;
                    this.L$3 = r4;
                    this.L$4 = r11;
                    this.L$5 = r8;
                    this.label = 1;
                    AnonymousClass46G r10 = new AnonymousClass46G(C57702u4.A01(this), 1);
                    r10.A0A();
                    int ordinal = r5.ordinal();
                    if (ordinal == 2) {
                        r6 = AnonymousClass0GH.ON_CREATE;
                    } else if (ordinal == 3) {
                        r6 = AnonymousClass0GH.ON_START;
                    } else if (ordinal != 4) {
                        r6 = null;
                    } else {
                        r6 = AnonymousClass0GH.ON_RESUME;
                    }
                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(r6, AnonymousClass0GH.A00(r5), r8, r9, r10, r11, C155227eU.A00());
                    r1.element = repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
                    r4.A00(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1);
                    if (r10.A06() == A05) {
                        return A05;
                    }
                }
                return C59022wD.A00;
            } else if (i == 1) {
                r1 = (C69903Yy) this.L$1;
                r9 = (C69903Yy) this.L$0;
                try {
                    C57682u2.A01(obj);
                } catch (Throwable th) {
                    C85474Gj r0 = (C85474Gj) r9.element;
                    if (r0 != null) {
                        r0.AyX((CancellationException) null);
                    }
                    C15110qn r12 = (C15110qn) r1.element;
                    if (r12 != null) {
                        r5.A01(r12);
                    }
                    throw th;
                }
            } else {
                throw AnonymousClass001.A0d();
            }
            C85474Gj r02 = (C85474Gj) r9.element;
            if (r02 != null) {
                r02.AyX((CancellationException) null);
            }
            C15110qn r13 = (C15110qn) r1.element;
            if (r13 != null) {
                r5.A01(r13);
            }
            return C59022wD.A00;
        }

        /* renamed from: A0B */
        public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
            return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AnonymousClass0GC r2, AnonymousClass0O9 r3, C84814Du r4, AnonymousClass4GR r5) {
        super(r4, 2);
        this.$this_repeatOnLifecycle = r3;
        this.$state = r2;
        this.$block = r5;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$state, this.$this_repeatOnLifecycle, r6, this.$block);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final AnonymousClass4C6 r8 = (AnonymousClass4C6) this.L$0;
            AnonymousClass46A A04 = AnonymousClass34M.A01().A04();
            final AnonymousClass0O9 r5 = this.$this_repeatOnLifecycle;
            final AnonymousClass0GC r4 = this.$state;
            final AnonymousClass4GR r7 = this.$block;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C57722u6.A00(this, A04, r3) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
