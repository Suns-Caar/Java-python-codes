class MIT:
    def __init__(self):
        self.type = 'Student'
        self.sut1 = self.student1()
        self.sut2 = self.student2()
        self.sut3 = self.student3()

    def show(self):
        print('Type: ', self.type)

    class student1:
        def __init__(self):
            self.name = 'Sanskar'
            self.registration = 200932212
            self.branch = 'EIE'

        def display(self):
            print('Name: ', self.name, 'registration: ', self.registration, 'branch: ', self.branch)

    class student2:
        def __init__(self):
            self.name = 'Name'
            self.registration = 123456789
            self.branch = 'brnch'

        def display(self):
            print('Name: ', self.name, 'registration: ', self.registration, 'branch: ', self.branch)

    class student3:
        def __init__(self):
            self.name = 'Name'
            self.registration = 12314124
            self.branch = 'branch'

        def display(self):
            print('Name: ', self.name, 'registration: ', self.registration, 'branch: ', self.branch)


outer = MIT()
outer.show()

s1 = outer.sut1
s2 = outer.sut2
s3 = outer.sut3
print()
s1.display()
print()
s2.display()
print()
s3.display()
