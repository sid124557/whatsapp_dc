package androidx.work.impl;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0NF;
import X.C012309s;
import X.C012409t;
import X.C09090fd;
import X.C09100fe;
import X.C09110ff;
import X.C09120fg;
import X.C09130fh;
import X.C09140fi;
import X.C09150fj;
import X.C15390rG;
import X.C15400rH;
import X.C15410rI;
import X.C16160sZ;
import X.C16170sa;
import X.C16760tv;
import X.C16770tw;
import X.C17060uV;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile C16160sZ A00;
    public volatile C16760tv A01;
    public volatile C15390rG A02;
    public volatile C16770tw A03;
    public volatile C15400rH A04;
    public volatile C15410rI A05;
    public volatile C17060uV A06;
    public volatile C16170sa A07;

    public List A03(Map map) {
        return Arrays.asList(new AnonymousClass0NF[]{new C012309s(), new C012409t()});
    }

    public C16160sZ A0E() {
        C16160sZ r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C09090fd(this);
            }
            r0 = this.A00;
        }
        return r0;
    }

    public C16760tv A0F() {
        C16760tv r0;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C09100fe(this);
            }
            r0 = this.A01;
        }
        return r0;
    }

    public C16770tw A0G() {
        C16770tw r0;
        if (this.A03 != null) {
            return this.A03;
        }
        synchronized (this) {
            if (this.A03 == null) {
                this.A03 = new C09110ff(this);
            }
            r0 = this.A03;
        }
        return r0;
    }

    public C15400rH A0H() {
        C15400rH r0;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new C09120fg(this);
            }
            r0 = this.A04;
        }
        return r0;
    }

    public C15410rI A0I() {
        C15410rI r0;
        if (this.A05 != null) {
            return this.A05;
        }
        synchronized (this) {
            if (this.A05 == null) {
                this.A05 = new C09130fh(this);
            }
            r0 = this.A05;
        }
        return r0;
    }

    public C17060uV A0J() {
        C17060uV r0;
        if (this.A06 != null) {
            return this.A06;
        }
        synchronized (this) {
            if (this.A06 == null) {
                this.A06 = new C09140fi(this);
            }
            r0 = this.A06;
        }
        return r0;
    }

    public C16170sa A0K() {
        C16170sa r0;
        if (this.A07 != null) {
            return this.A07;
        }
        synchronized (this) {
            if (this.A07 == null) {
                this.A07 = new C09150fj(this);
            }
            r0 = this.A07;
        }
        return r0;
    }

    public Map A04() {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put(C17060uV.class, Collections.emptyList());
        A0t.put(C16160sZ.class, Collections.emptyList());
        A0t.put(C16170sa.class, Collections.emptyList());
        A0t.put(C16770tw.class, Collections.emptyList());
        A0t.put(C15400rH.class, Collections.emptyList());
        A0t.put(C15410rI.class, Collections.emptyList());
        A0t.put(C16760tv.class, Collections.emptyList());
        A0t.put(C15390rG.class, Collections.emptyList());
        return A0t;
    }

    public Set A05() {
        return AnonymousClass002.A0K();
    }
}
