package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.24c  reason: invalid class name and case insensitive filesystem */
public class C378124c extends Number implements Serializable {
    public static final long serialVersionUID = 0;
    public transient AtomicLong A00;

    public double doubleValue() {
        return Double.longBitsToDouble(this.A00.get());
    }

    public float floatValue() {
        return (float) Double.longBitsToDouble(this.A00.get());
    }

    public int intValue() {
        return (int) Double.longBitsToDouble(this.A00.get());
    }

    public long longValue() {
        return (long) Double.longBitsToDouble(this.A00.get());
    }

    public String toString() {
        return Double.toString(Double.longBitsToDouble(this.A00.get()));
    }

    public C378124c(double d) {
        this.A00 = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A00 = new AtomicLong();
        this.A00.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(Double.longBitsToDouble(this.A00.get()));
    }

    public C378124c() {
        this(0.0d);
    }
}
