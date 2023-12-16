package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8Kn  reason: invalid class name and case insensitive filesystem */
public final class C172318Kn implements Externalizable {
    public static final long serialVersionUID = 0;
    public Map map;

    public void readExternal(ObjectInput objectInput) {
        C162457s7.A0J(objectInput, 0);
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                AnonymousClass8OR r3 = new AnonymousClass8OR(readInt);
                for (int i = 0; i < readInt; i++) {
                    r3.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = AnonymousClass8UG.A0K(r3);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Illegal size value: ");
            A0o.append(readInt);
            throw new InvalidObjectException(AnonymousClass001.A0j(A0o, '.'));
        }
        throw new InvalidObjectException(AnonymousClass000.A0Y("Unsupported flags value: ", AnonymousClass001.A0o(), readByte));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C162457s7.A0J(objectOutput, 0);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        Iterator A0q = AnonymousClass000.A0q(this.map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            objectOutput.writeObject(A0w.getKey());
            objectOutput.writeObject(A0w.getValue());
        }
    }

    private final Object readResolve() {
        return this.map;
    }

    public C172318Kn(Map map2) {
        this.map = map2;
    }

    public C172318Kn() {
        this(C73813g7.A0A());
    }
}
