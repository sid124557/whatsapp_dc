package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2FZ;
import X.AnonymousClass4GR;
import X.C18320x8;
import X.C27991fJ;
import X.C369720l;
import X.C51472js;
import X.C57682u2;
import X.C59022wD;
import X.C72553du;
import X.C72623e1;
import X.C72633e2;
import X.C73723fy;
import X.C73813g7;
import X.C73853gB;
import X.C75003pT;
import X.C823543g;
import X.C832646t;
import X.C84814Du;
import X.C86054Iq;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2", f = "CompoundContactsLoader.kt", i = {0}, l = {45}, m = "invokeSuspend", n = {"resultMap"}, s = {"L$1"})
public final class CompoundContactsLoader$loadContacts$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ C73853gB $dispatcher;
    public final /* synthetic */ C27991fJ $groupJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass2FZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2(AnonymousClass2FZ r2, C27991fJ r3, C84814Du r4, C73853gB r5, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$concurrentCapacity = i;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    public final Object A09(Object obj) {
        Map map;
        Iterator it;
        String str;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C72623e1 r1 = new C72623e1(new C823543g(this.$groupJid, this.$dispatcher), C73723fy.A0R(this.this$0.A00));
            int i2 = this.$concurrentCapacity;
            if (i2 > 0) {
                C72633e2 r0 = new C72633e2(r1, i2, i2);
                map = C18320x8.A0r();
                it = r0.iterator();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                if (i2 != i2) {
                    A0o.append("Both size ");
                    A0o.append(i2);
                    str = " and step ";
                } else {
                    str = "size ";
                }
                A0o.append(str);
                A0o.append(i2);
                throw AnonymousClass000.A0F(" must be greater than zero.", A0o);
            }
        } else if (i == 1) {
            map = (Map) this.L$1;
            it = (Iterator) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        while (it.hasNext()) {
            C832646t r2 = new C832646t((Iterable) it.next(), C72553du.A00, C369720l.SUSPEND, -2);
            C86054Iq r02 = new C86054Iq(map, 8);
            this.L$0 = it;
            this.L$1 = map;
            this.label = 1;
            if (r2.Az8(this, r02) == r4) {
                return r4;
            }
        }
        return new C51472js(C73813g7.A0D(map));
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new CompoundContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r8, this.$dispatcher, this.$concurrentCapacity);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
