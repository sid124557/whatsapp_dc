package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.84x  reason: invalid class name and case insensitive filesystem */
public abstract class C1683084x implements FileStash {
    public final FileStash A00;

    public Set B4Q() {
        LinkedHashSet linkedHashSet;
        if (!(this instanceof C126246Nc)) {
            return this.A00.B4Q();
        }
        C126246Nc r9 = (C126246Nc) this;
        C183718qV r10 = r9.A00;
        long now = r10.now();
        long j = C126246Nc.A04;
        if (r10.now() - r9.A02 > j) {
            Set set = r9.A01;
            synchronized (set) {
                if (r10.now() - r9.A02 > j) {
                    set.clear();
                    set.addAll(r9.A00.B4Q());
                    r9.A02 = now;
                }
            }
        }
        Set set2 = r9.A01;
        synchronized (set2) {
            linkedHashSet = new LinkedHashSet(set2);
        }
        return linkedHashSet;
    }

    public long B8j(String str) {
        return this.A00.B8j(str);
    }

    public long BD6() {
        return this.A00.BD6();
    }

    public boolean BFI(String str) {
        if (!(this instanceof C126246Nc)) {
            return this.A00.BFI(str);
        }
        C126246Nc r5 = (C126246Nc) this;
        if (r5.A02 == C126246Nc.A03) {
            Set set = r5.A01;
            if (!set.contains(str)) {
                if (!r5.A00.BFI(str)) {
                    return false;
                }
                set.add(str);
                return true;
            }
        }
        return r5.A01.contains(str);
    }

    public long BJW(String str) {
        return this.A00.BJW(str);
    }

    public boolean Bj4(String str) {
        if (this instanceof C126236Nb) {
            return Bj5(str, 0);
        }
        C126246Nc r1 = (C126246Nc) this;
        r1.A01.remove(str);
        return r1.A00.Bj4(str);
    }

    public boolean Bj5(String str, int i) {
        if (this instanceof C126236Nb) {
            C126236Nb r0 = (C126236Nb) this;
            List list = r0.A02;
            boolean isEmpty = list.isEmpty();
            boolean Bj5 = r0.A00.Bj5(str, 0);
            if (!isEmpty) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onRemove");
                }
            }
            return Bj5;
        }
        C126246Nc r2 = (C126246Nc) this;
        r2.A01.remove(str);
        return r2.A00.Bj5(str, 0);
    }

    public boolean Bj6() {
        FileStash fileStash;
        if (this instanceof C126246Nc) {
            C126246Nc r1 = (C126246Nc) this;
            r1.A01.clear();
            fileStash = r1.A00;
        } else {
            fileStash = this.A00;
        }
        return fileStash.Bj6();
    }

    public File getFile(String str) {
        String str2;
        boolean hasNext;
        if (this instanceof C126236Nb) {
            C126236Nb r2 = (C126236Nb) this;
            List list = r2.A00;
            if (list.isEmpty()) {
                return r2.A00.getFile(str);
            }
            try {
                FileStash fileStash = r2.A00;
                File file = fileStash.getFile(str);
                fileStash.BFI(str);
                if (!hasNext) {
                    return file;
                }
                throw AnonymousClass001.A0g(str2);
            } finally {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    str2 = "onGet";
                    throw AnonymousClass001.A0g(str2);
                }
            }
        } else {
            C126246Nc r5 = (C126246Nc) this;
            if (r5.A02 == C126246Nc.A03 || r5.A01.contains(str)) {
                return r5.A00.getFile(str);
            }
            return null;
        }
    }

    public File getFilePath(String str) {
        return this.A00.getFilePath(str);
    }

    public File insertFile(String str) {
        String str2;
        boolean hasNext;
        if (this instanceof C126236Nb) {
            C126236Nb r0 = (C126236Nb) this;
            List list = r0.A01;
            boolean isEmpty = list.isEmpty();
            FileStash fileStash = r0.A00;
            if (isEmpty) {
                return fileStash.insertFile(str);
            }
            fileStash.BFI(str);
            try {
                if (!hasNext) {
                    return fileStash.insertFile(str);
                }
                throw AnonymousClass001.A0g(str2);
            } finally {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    str2 = "onInsert";
                    throw AnonymousClass001.A0g(str2);
                }
            }
        } else {
            C126246Nc r1 = (C126246Nc) this;
            r1.A01.add(str);
            return r1.A00.insertFile(str);
        }
    }

    public C1683084x(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
