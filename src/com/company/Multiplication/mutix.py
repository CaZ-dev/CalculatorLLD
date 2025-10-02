from typing import Union

Number = Union[int, float]

def complex_multiply(a: complex, b: complex) -> complex:
    """
    Multiply two complex numbers.
    
    Args:
        a (complex): First complex number.
        b (complex): Second complex number.
    
    Returns:
        complex: The product of a and b.
    """
    return a * b


def manual_complex_multiply(real1: Number, imag1: Number, real2: Number, imag2: Number) -> complex:
    """
    Multiply two complex numbers manually using (a+bi)(c+di) = (ac - bd) + (ad + bc)i
    
    Args:
        real1 (int | float): Real part of first number
        imag1 (int | float): Imaginary part of first number
        real2 (int | float): Real part of second number
        imag2 (int | float): Imaginary part of second number
    
    Returns:
        complex: The product as a complex number
    """
    real_part: float = (real1 * real2) - (imag1 * imag2)
    imag_part: float = (real1 * imag2) + (imag1 * real2)
    return complex(real_part, imag_part)


if __name__ == "__main__":
    # Example usage
    z1: complex = complex(3, 2)   # 3 + 2i
    z2: complex = complex(1, 7)   # 1 + 7i
    
    print("Using built-in:", complex_multiply(z1, z2))
    print("Using manual:", manual_complex_multiply(3, 2, 1, 7))
