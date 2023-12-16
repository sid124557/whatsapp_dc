package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3od  reason: invalid class name and case insensitive filesystem */
public final class C74933od extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C8[] $flows;
    public final /* synthetic */ int $i;
    public final /* synthetic */ AtomicInteger $nonClosed;
    public final /* synthetic */ C85504Gn $resultChannel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74933od(AtomicInteger atomicInteger, C84814Du r3, C85504Gn r4, AnonymousClass4C8[] r5, int i) {
        super(r3, 2);
        this.$flows = r5;
        this.$i = i;
        this.$nonClosed = atomicInteger;
        this.$resultChannel = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8[] r0 = this.$flows;
            int i2 = this.$i;
            AnonymousClass4C8 r2 = r0[i2];
            C86064Ir r02 = new C86064Ir(this.$resultChannel, i2, 1);
            this.label = 1;
            if (r2.Az8(this, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C57682u2.A01(obj);
            } catch (Throwable th) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.Az4((Throwable) null);
                }
                throw th;
            }
        } else {
            throw AnonymousClass001.A0d();
        }
        if (this.$nonClosed.decrementAndGet() == 0) {
            this.$resultChannel.Az4((Throwable) null);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new C74933od(this.$nonClosed, r8, this.$resultChannel, this.$flows, this.$i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
